package com.example.gowelectricity.service.order;

import com.example.gowelectricity.mapper.auto.GoodsMapper;
import com.example.gowelectricity.mapper.auto.OrderMapper;
import com.example.gowelectricity.mapper.auto.OrderPayImgMapper;
import com.example.gowelectricity.mapper.ext.OrderExtMapper;
import com.example.gowelectricity.model.auto.Goods;
import com.example.gowelectricity.model.auto.Order;
import com.example.gowelectricity.model.auto.OrderPayImg;
import com.example.gowelectricity.model.req.order.OrderAddReq;
import com.example.gowelectricity.model.rsp.ResultRsp;
import com.example.gowelectricity.model.rsp.order.OrderReq;
import com.example.gowelectricity.model.rsp.pay.PayInfo;
import com.example.gowelectricity.model.rsp.pay.PayQueryInfo;
import com.example.gowelectricity.model.rsp.pay.PayReturnInfo;
import com.example.gowelectricity.util.*;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderService
 * @Author lzn
 * @DATE 2019/10/17 14:25
 */
@Service
public class OrderService {

    private final static transient Logger logger = LoggerFactory.getLogger(OrderService.class);
    private static final String ELLIPSIS= "..............................";

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderExtMapper orderExtMapper;

    @Autowired
    private OrderPayImgMapper orderPayImgMapper;

    /**
     * 新增订单
     * */
    public ResultRsp add(OrderAddReq req){
        ResultRsp rsp = new ResultRsp();
        //
        Goods goods = goodsMapper.selectByPrimaryKey(req.getGoodsId());
        if(null == goods){
            rsp.setStatus(-1);
            rsp.setMsg("商品已售完,您可以稍等后再重新购买哦!");
            return rsp;
        }else{
            logger.error("准备保存新增订单"+ELLIPSIS);
            Order order = new Order();
            order.setOrderCode(CodeUtil.getCode("D"));
            order.setCreateTime(new Date());
            //计算订单金额
            order.setOrderPrice(goods.getPrice().multiply(new BigDecimal(req.getNumber()<=0?1:req.getNumber())));
            order.setOrderStatus("0");
            //收货信息
            order.setShippingProvince(req.getProvince());
            order.setShippingCity(req.getCity());
            order.setShippingCounty(req.getDistrict());
            order.setShippingAddress(req.getDetailaddress());
            order.setShippingPerson(req.getName());
            order.setMobile(req.getMobile());
            //商品信息
            order.setGoodsId(goods.getId());
            order.setGoodsName(goods.getGoodsName());
            //购买数量
            order.setGoodsNumber(req.getNumber());
            //保存
            int count = orderMapper.insertSelective(order);
            rsp.setMsg("您的商品已成功下单!");

            logger.error("准备发起支付请求"+ELLIPSIS);
            //支付需要用到的信息
            PayInfo payInfo = new PayInfo();
            payInfo.setName(order.getGoodsName());
            payInfo.setOrder_id(order.getOrderCode());
            payInfo.setOrder_uid(order.getId()+"");
            payInfo.setPrice(order.getOrderPrice());
            //调起支付信息
            rsp.setData(this.payReturnJson(payInfo,order.getId()));
            return rsp;
        }
    }

    /**
     * 调起支付
     * */
    private String pay(PayInfo payInfo,boolean isJson){
        logger.error("发起调用支付成功"+ELLIPSIS);
        //回调地址、调用地址、支付方式
        payInfo.setNotify_url("http://39.100.229.21:8991/order/data/notify");
        payInfo.setReturn_url("http://39.100.229.21:8991/order/data/returnurl");
        payInfo.setPay_type("wechat");
        //参数处理
        String goodsNames = payInfo.getName().trim();
        String payType = payInfo.getPay_type().trim();
        double priceValue = payInfo.getPrice().doubleValue();
        String orderId = payInfo.getOrder_id();
        String orderUid = payInfo.getOrder_uid();
        String notifyUrl = payInfo.getNotify_url();
        String returnUrl = payInfo.getReturn_url();
        String appSecret = "967e0dc6b34e46c082af6997253fde6c";
        int expire = 24*60*60*1000;
        //如果需要返回json数，则在参数后加上这个参数
        String format = "json";
        String paramData=goodsNames+payType+priceValue+orderId+orderUid+notifyUrl+returnUrl+appSecret;
        String sign = MD5.md5(paramData);
        String sendString = "name="+goodsNames+"&pay_type="+payType+"&price="+priceValue+"&order_id="+orderId
                +"&order_uid="+orderUid+"&notify_url="+notifyUrl+"&return_url="+returnUrl
                +"&sign="+sign+"&expire="+expire;
        if(isJson){
            sendString = sendString+"&format="+format;
        }
        String path = "http://bufpay.com/api/pay/95134";
        //发起调用支付
        String returnValue = HttpUtil.doPost(path,sendString);
        return returnValue;
    }

    /**
     * 调起支付
     * @return json
     * */
    public String payReturnHtml(PayInfo payInfo){
        return this.pay(payInfo,false);
    }

    /**
     * 调起支付
     * @return json
     * */
    public PayReturnInfo payReturnJson(PayInfo payInfo,Long orderId){
        String returnValue = this.pay(payInfo,true);
        //处理
        JSONObject jsonObject = JSONObject.fromObject(returnValue);
        PayReturnInfo info = (PayReturnInfo)JSONObject.toBean(jsonObject,PayReturnInfo.class);
        if(info.getStatus().equals(PayReturnInfo.STATUS_OK)) {
            //支付aoid
            Order order = new Order();
            order.setId(orderId);
            order.setAoid(info.getAoid());
            orderMapper.updateByPrimaryKeySelective(order);
            //保存支付码
            OrderPayImg orderPayImg = new OrderPayImg();
            orderPayImg.setAoid(info.getAoid());
            orderPayImg.setQrImg(info.getQr_img());
            orderPayImg.setPrice(info.getPrice());
            orderPayImgMapper.insertSelective(orderPayImg);
            info.setPayId(orderPayImg.getId());
        }
        return info;
    }

    /**
     * 支付回调
     * */
    public int notifyPay(String aoid,String order_id,String order_uid,double price,double pay_price,String sign){
        logger.error("支付回调"+ELLIPSIS);
        Order order = new Order();
        order.setOrderCode(order_id);
        order.setPayPrice(new BigDecimal(pay_price));
        order.setPayTime(new Date());
        order.setOrderStatus("1");
        int count = orderExtMapper.updatePayInfoByCode(order);
        if(count > 0){
            logger.error("支付回调成功"+ELLIPSIS);
            return 200;
        }
        return 0;
    }


    /**
     * 根据aoid 查询支付状态
     * */
    public ResultRsp getPayStatusByAoid(String aoid){
        logger.error("准备根据aoid 查询支付状态"+ELLIPSIS);

        String path = "http://bufpay.com/api/query/"+aoid;
        String returnValue = HttpUtil.doGet(path);
        JSONObject jsonObject = JSONObject.fromObject(returnValue);
        PayQueryInfo queryInfo = (PayQueryInfo)JSONObject.toBean(jsonObject,PayQueryInfo.class);

        if(null != queryInfo && null != queryInfo.getStatus()){
            logger.error("根据aoid 查询支付状态成功"+ELLIPSIS);
            if(queryInfo.getStatus().equals(PayQueryInfo.NOT_EXIST)){
                return new ResultRsp(-2,queryInfo,"订单不存在");
            }else if (queryInfo.getStatus().equals(PayQueryInfo.NEW)){
                return new ResultRsp(-2,queryInfo,"新订单");
            }else if (queryInfo.getStatus().equals(PayQueryInfo.SUCCESS)){
                return new ResultRsp(-2,queryInfo,"订单已支付已经回调成功");
            }else if (queryInfo.getStatus().equals(PayQueryInfo.FEE_ERROR)){
                return new ResultRsp(-2,queryInfo,"账户余额不足扣除手续费失败，订单未回调");
            }else if (queryInfo.getStatus().equals(PayQueryInfo.EXPIRE)){
                return new ResultRsp(-2,queryInfo,"订单已过期");
            }else if (queryInfo.getStatus().equals(PayQueryInfo.PAYED)){
                logger.error("准备修改订单支付状态"+ELLIPSIS);
                //修改订单支付状态
                Order order = new Order();
                order.setAoid(aoid);
                order.setPayTime(new Date());
                order.setOrderStatus("1");
                int count = orderExtMapper.updatePayInfoByCode(order);
                if(count > 0){
                    return new ResultRsp(0,null,"支付成功");
                }
                return new ResultRsp(-2,queryInfo,"订单已支付未回调");
            }
        }
        return new ResultRsp(-2,null,"查询支付状态失败");
    }


    /**
     * 根据电话号码或收件人名称查询订单
     * */
    public List<OrderReq> selectOrderByMobileOrPersonName(String mobile, String personName){
        List<OrderReq> orderReqs = new ArrayList<>();
        List<Order> orderList = orderExtMapper.selectOrderByMobileOrPersonName(mobile,personName);
        if(!CollectionUtils.isEmpty(orderList)){
            for(Order order : orderList) {
                OrderReq req = new OrderReq();
                BeanUtil.copyProperties(order,req);
                req.setCreateTimeF(DateUtil.dateToString(order.getCreateTime(),DateUtil.PATTERN_YEAR_MONTH_DAY_HOURS_MINUTE));

                orderReqs.add(req);
            }
        }
        return orderReqs;
    }
}
