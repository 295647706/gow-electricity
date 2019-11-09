package com.example.gowelectricity.mapper.auto;

import com.example.gowelectricity.model.auto.OrderPayImg;
import com.example.gowelectricity.model.auto.OrderPayImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPayImgMapper {
    long countByExample(OrderPayImgExample example);

    int deleteByExample(OrderPayImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderPayImg record);

    int insertSelective(OrderPayImg record);

    List<OrderPayImg> selectByExampleWithBLOBs(OrderPayImgExample example);

    List<OrderPayImg> selectByExample(OrderPayImgExample example);

    OrderPayImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderPayImg record, @Param("example") OrderPayImgExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderPayImg record, @Param("example") OrderPayImgExample example);

    int updateByExample(@Param("record") OrderPayImg record, @Param("example") OrderPayImgExample example);

    int updateByPrimaryKeySelective(OrderPayImg record);

    int updateByPrimaryKeyWithBLOBs(OrderPayImg record);

    int updateByPrimaryKey(OrderPayImg record);
}