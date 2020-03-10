package com.example.gowelectricity;

import com.example.gowelectricity.controller.desk.order.OrderController;
import com.example.gowelectricity.model.rsp.ResultRsp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName OrderController
 * @Author lzn
 * @DATE 2019/11/12 10:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTestController {

    @Autowired
    private OrderController orderController;


    /**
     * 根据aoid 查询支付状态
     * */
    @Test
    public void getPayStatusByAoid(){
        String aoid = "46f3065f3d874ec1a2a79fd33975c5fb";
        ResultRsp rsp = orderController.getPayStatusByAoid(aoid);
        System.err.println(rsp.toString());
    }
}
