package com.example.gowelectricity.model.rsp.order;

import com.example.gowelectricity.model.auto.Order;
import lombok.Data;

/**
 * @ClassName OrderReq
 * @Author lzn
 * @DATE 2019/11/9 13:51
 */
@Data
public class OrderReq extends Order {

    private String createTimeF;

    private String payId;
}
