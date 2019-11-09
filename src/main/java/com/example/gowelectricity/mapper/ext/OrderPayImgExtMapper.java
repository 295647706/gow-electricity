package com.example.gowelectricity.mapper.ext;

import com.example.gowelectricity.model.auto.OrderPayImg;
import com.example.gowelectricity.model.auto.OrderPayImgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderPayImgExtMapper {

    OrderPayImg selectByAoid(String aoid);
}