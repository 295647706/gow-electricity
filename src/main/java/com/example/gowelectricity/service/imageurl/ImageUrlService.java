package com.example.gowelectricity.service.imageurl;

import com.example.gowelectricity.mapper.auto.ImageUrlMapper;
import com.example.gowelectricity.model.auto.ImageUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ImageUrlService
 * @Author lzn
 * @DATE 2019/10/11 10:38
 */
@Service
public class ImageUrlService {

    @Autowired
    private ImageUrlMapper imageUrlMapper;

    public ImageUrl get(Long id){
        return imageUrlMapper.selectByPrimaryKey(id);
    }
}
