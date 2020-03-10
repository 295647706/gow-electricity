package com.example.gowelectricity.controller.desk.pay;

import com.example.gowelectricity.mapper.auto.OrderMapper;
import com.example.gowelectricity.mapper.auto.OrderPayImgMapper;
import com.example.gowelectricity.mapper.ext.OrderPayImgExtMapper;
import com.example.gowelectricity.model.auto.Order;
import com.example.gowelectricity.model.auto.OrderPayImg;
import com.example.gowelectricity.model.req.PayInfoReq;
import com.example.gowelectricity.model.rsp.pay.PayInfo;
import com.example.gowelectricity.model.rsp.pay.PayReturnInfo;
import com.example.gowelectricity.service.order.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName PayController
 * @Author lzn
 * @DATE 2019/11/8 14:24
 */
@Api(tags = "支付")
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderPayImgMapper orderPayImgMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderPayImgExtMapper orderPayImgExtMapper;

    @ApiOperation(value = "支付页面")
    @GetMapping("/page/payPage")
    public ModelAndView payPage(int payId,String aoid){
        ModelAndView view = new ModelAndView("pay/pay-page");
        OrderPayImg orderPayImg = orderPayImgMapper.selectByPrimaryKey(payId);
        if(orderPayImg.getAoid().equals(aoid)) {
            view.addObject("aoid",aoid);
            view.addObject("price", orderPayImg == null ? "" : orderPayImg.getPrice());
            view.addObject("qr_img", orderPayImg == null ? "" : orderPayImg.getQrImg());
        }
        return view;
    }

    /**
     * 去支付
     * */
    @GetMapping("/doPay/{orderId}")
    public ModelAndView doPay(@PathVariable("orderId") Long orderId){
        ModelAndView view = new ModelAndView("pay/pay-page");
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if(null != order){
            if(null != order.getAoid()) {
                OrderPayImg orderPayImg = orderPayImgExtMapper.selectByAoid(order.getAoid());
                if(null != orderPayImg){
                    view.addObject("aoid",orderPayImg.getAoid());
                    view.addObject("price",orderPayImg.getPrice());
                    view.addObject("qr_img",orderPayImg.getQrImg());
                    return view;
                }
            }else{
                PayInfo payInfo = new PayInfo();
                payInfo.setName(order.getGoodsName());
                payInfo.setOrder_id(order.getOrderCode());
                payInfo.setOrder_uid(order.getId()+"");
                payInfo.setPrice(order.getOrderPrice());
                PayReturnInfo returnInfo = orderService.payReturnJson(payInfo,order.getId());
                if(null != returnInfo){
                    view.addObject("aoid",returnInfo.getAoid());
                    view.addObject("price",returnInfo.getPrice());
                    view.addObject("qr_img",returnInfo.getQr_img());
                    return view;
                }
            }
        }
        return view;
    }

}
