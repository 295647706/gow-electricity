package com.example.gowelectricity.controller.desk.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName GoodsController
 * @Author lzn
 * @DATE 2019/10/15 14:22
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @GetMapping("/page/goods-detail")
    public ModelAndView detail(){
        ModelAndView view = new ModelAndView("goods/goods-detail");
        return view;
    }
}
