package com.example.gowelectricity.model.rsp.pay;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName PayInfo
 * @Author lzn
 * @DATE 2019/10/28 14:15
 */
@Data
public class PayInfo {

    private String name;

    private BigDecimal price;

    private String order_id;

    private String order_uid;

    private String notify_url;

    private String return_url;

    private String sign;

    private String pay_type;
}
