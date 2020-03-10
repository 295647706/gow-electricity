package com.example.gowelectricity.controller.boss.goods;

import com.example.common.result.Result;
import com.example.common.result.ResultUtil;
import com.example.gowelectricity.model.req.goods.GoodsAddReq;
import com.example.gowelectricity.service.goods.GoodsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName GoodsBossController
 * @Author lzn
 * @DATE 2019/12/5 17:01
 */
@Api(tags = "管理-商品")
@Controller
@RequestMapping("/boss/goods")
public class GoodsBossController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goodsadd")
    public ModelAndView goodsAdd(){
        ModelAndView view = new ModelAndView("boss/goods/goods-add");
        return view;
    }

    /**
     * 新增商品
     * */
    @PostMapping("/add")
    @ResponseBody
    public Result add(GoodsAddReq req){
        return ResultUtil.success(goodsService.add(req));
    }
}
