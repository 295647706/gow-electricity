package com.example.gowelectricity.controller.desk.order;

import com.example.gowelectricity.model.req.order.OrderAddReq;
import com.example.gowelectricity.model.rsp.ResultRsp;
import com.example.gowelectricity.service.order.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName OrderController
 * @Author lzn
 * @DATE 2019/10/17 14:14
 */
@Api(tags = "订单")
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "新增订单")
    @PostMapping("/data/add")
    @ResponseBody
    public ResultRsp add(OrderAddReq req){
        return orderService.add(req);
    }


    /**
     * 根据aoid 查询支付状态
     * */
    @ApiOperation(value = "根据aoid 查询支付状态")
    @GetMapping("/data/getPayStatus/{aoid}")
    @ResponseBody
    public ResultRsp getPayStatusByAoid(@PathVariable("aoid") String aoid){
        return orderService.getPayStatusByAoid(aoid);
    }

    /**
     * 支付回调
     * */
    @ApiOperation(value = "支付回调")
    @PostMapping("/data/notify")
    @ResponseBody
    public int notify(String aoid,String order_id,String order_uid,double price,double pay_price,String sign){
        return orderService.notifyPay(aoid,order_id,order_uid,price,pay_price,sign);
    }

    /**
     * 支付跳转
     * */
    @ApiOperation(value = "支付跳转")
    @PostMapping("/data/returnurl")
    @ResponseBody
    public int returnurl(String order_id){
        return 0;
    }

}
