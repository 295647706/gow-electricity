package com.example.gowelectricity.controller.desk.goods;

import com.example.gowelectricity.model.rsp.goods.GoodsRsp;
import com.example.gowelectricity.service.goods.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName GoodsController
 * @Author lzn
 * @DATE 2019/10/15 14:22
 */
@Api(tags = "商品")
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @ApiOperation(value = "商品前端详情页面")
    @GetMapping("/page/goods-detail")
    public ModelAndView detail(Long id){
        ModelAndView view = new ModelAndView("goods/goods-detail");
        view.addObject("goodsId",id);
        return view;
    }

    /**
     * 根据id 查询详情
     * */
    @ApiOperation(value = "根据id 查询详情")
    @GetMapping("/data/get/{id}")
    @ResponseBody
    public GoodsRsp get(@PathVariable("id") Long id){
        return goodsService.get(id);
    }
}
