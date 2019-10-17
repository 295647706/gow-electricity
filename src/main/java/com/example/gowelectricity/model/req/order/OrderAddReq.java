package com.example.gowelectricity.model.req.order;

import lombok.Data;

/**
 * @ClassName OrderAddReq
 * @Author lzn
 * @DATE 2019/10/17 14:21
 */
@Data
public class OrderAddReq {

    //商品id
    private Long goodsId;

    //购买数量
    private int number;

    //省
    private String province;

    //市
    private String city;

    //县区
    private String district;

    //详细地址
    private String detailaddress;

    //收货人名称
    private String name;

    //收货电话
    private String mobile;
}
