package com.example.gowelectricity.controller.desk.aftersale;

import com.example.gowelectricity.model.rsp.ResultRsp;
import com.example.gowelectricity.model.rsp.order.OrderReq;
import com.example.gowelectricity.service.order.OrderService;
import com.example.gowelectricity.util.HttpsUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AfterSalesController
 * @Author lzn
 * @DATE 2019/10/18 10:54
 */
@Api(tags = "售后")
@Controller
@RequestMapping("/aftersales")
public class AfterSalesController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "售后前端页面")
    @GetMapping("/page/after-sales")
    public ModelAndView afterSales(Long id){
        ModelAndView view = new ModelAndView("aftersale/after-sales");
        return view;
    }

    @ApiOperation(value = "支付页面")
    @GetMapping("/payPage")
    public ModelAndView payPage(){
        ModelAndView view = new ModelAndView("pay/pay");
        return view;
    }

    @ApiOperation(value = "支付")
    @GetMapping("/pay")
    public void pay() throws Exception{
        StringBuffer sb = new StringBuffer();
        sb.append("<form action='' method='post'>\n" +
                "\t<input name='name' id='name' value='商品1'>\n" +
                "\t<input name='pay_type' id='pay_type' value='wechat'>\n" +
                "\t<input name='price' id='price' value='0.01'>\n" +
                "\t<input name='order_id' id='order_id' value='201908261310111234'>\n" +
                "\t<input name='order_uid' id='order_uid' value='1001'>\n" +
                "\t<input name='notify_url' id='notify_url' value='http://gow.hdongx.comnull201908261310111234'>\n" +
                "\t<input name='return_url' id='return_url' value='http://gow.hdongx.com/orderPage/order2-page'>\n" +
                "\t<input name='sign' id='sign' value='432dd92289f28dd608337c3414965d76'>\n" +
                "\t<input name='expire' id='expire' value='86400000'>\n" +
                "\t<input type='submit'>\n" +
                "</form>");
        HttpsUtil.https("https://bufpay.com/api/pay/95134",sb.toString());
    }



    /**
     * 订单物流信息 - 页面
     * */
    @GetMapping("/express-page/{mobile}")
    public ModelAndView expressPage(@PathVariable("mobile") String mobile){
        ModelAndView view = new ModelAndView("aftersale/express");
        return view;
    }


    /**
     * 订单物流信息
     * */
    @PostMapping("/express-info")
    @ResponseBody
    public ResultRsp expressInfo(String mobile, String personName){
        ResultRsp rsp = new ResultRsp();
        rsp.setStatus(0);
        rsp.setData(orderService.selectOrderByMobileOrPersonName(mobile,personName));
        rsp.setMsg("执行成功");
        return rsp;
    }



}
