package com.example.gowelectricity.service.order;

import com.example.gowelectricity.mapper.auto.GoodsMapper;
import com.example.gowelectricity.mapper.auto.OrderMapper;
import com.example.gowelectricity.model.auto.Goods;
import com.example.gowelectricity.model.auto.Order;
import com.example.gowelectricity.model.req.order.OrderAddReq;
import com.example.gowelectricity.model.rsp.ResultRsp;
import com.example.gowelectricity.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @ClassName OrderService
 * @Author lzn
 * @DATE 2019/10/17 14:25
 */
@Service
public class OrderService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private OrderMapper orderMapper;

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
            Order order = new Order();
            order.setOrderCode(CodeUtil.getCode("D"));
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
            return rsp;
        }
    }
}
