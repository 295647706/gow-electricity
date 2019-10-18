package com.example.gowelectricity.controller.desk.aftersale;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName AfterSalesController
 * @Author lzn
 * @DATE 2019/10/18 10:54
 */
@Api(tags = "售后")
@Controller
@RequestMapping("/aftersales")
public class AfterSalesController {

    @ApiOperation(value = "售后前端页面")
    @GetMapping("/page/after-sales")
    public ModelAndView afterSales(Long id){
        ModelAndView view = new ModelAndView("aftersale/after-sales");
        return view;
    }
}
