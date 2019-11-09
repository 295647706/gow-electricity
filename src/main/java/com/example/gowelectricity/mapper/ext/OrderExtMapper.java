package com.example.gowelectricity.mapper.ext;

import com.example.gowelectricity.model.auto.Order;
import com.example.gowelectricity.model.auto.OrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderExtMapper {

    int updatePayInfoByCode(Order order);

    int updatePayInfoByAoid(Order order);

    List<Order> selectOrderByMobileOrPersonName(@Param("mobile") String mobile,@Param("personName") String personName);
}