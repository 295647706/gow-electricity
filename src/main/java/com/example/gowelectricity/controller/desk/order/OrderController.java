package com.example.gowelectricity.controller.desk.order;

import com.example.gowelectricity.model.req.order.OrderAddReq;
import com.example.gowelectricity.model.rsp.ResultRsp;
import com.example.gowelectricity.service.order.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
