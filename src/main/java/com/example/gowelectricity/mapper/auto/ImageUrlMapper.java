package com.example.gowelectricity.mapper.auto;

import com.example.gowelectricity.model.auto.ImageUrl;
import com.example.gowelectricity.model.auto.ImageUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageUrlMapper {
    long countByExample(ImageUrlExample example);

    int deleteByExample(ImageUrlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImageUrl record);

    int insertSelective(ImageUrl record);

    List<ImageUrl> selectByExample(ImageUrlExample example);

    ImageUrl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImageUrl record, @Param("example") ImageUrlExample example);

    int updateByExample(@Param("record") ImageUrl record, @Param("example") ImageUrlExample example);

    int updateByPrimaryKeySelective(ImageUrl record);

    int updateByPrimaryKey(ImageUrl record);
}