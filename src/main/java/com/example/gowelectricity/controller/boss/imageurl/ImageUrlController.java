package com.example.gowelectricity.controller.boss.imageurl;

import com.example.gowelectricity.model.auto.ImageUrl;
import com.example.gowelectricity.service.imageurl.ImageUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName ImageUrlController
 * @Author lzn
 * @DATE 2019/10/11 10:31
 */
@Controller
@RequestMapping("/boss/imageurl")
public class ImageUrlController {

    @Autowired
    private ImageUrlService imageUrlService;

    @GetMapping("get/{id}")
    @ResponseBody
    public ImageUrl get(@PathVariable("id") Long id){
        return imageUrlService.get(id);
    }
}
