package com.example.gowelectricity.model.rsp.pay;

import lombok.Data;

/**
 * @ClassName PayQueryInfo
 * @Author lzn
 * @DATE 2019/11/8 10:23
 */
@Data
public class PayQueryInfo {

    /*****************************************************查询提示代码************************/
    //订单不存在
    public static final String  NOT_EXIST = "not_exist";
    //新订单
    public static final String NEW = "new";
    //订单已支付未回调
    public static final String PAYED = "payed";
    //订单已支付已经回调成功
    public static final String SUCCESS = "success";
    //账户余额不足扣除手续费失败，订单未回调
    public static final String FEE_ERROR = "fee_error";
    //订单已过期
    public static final String EXPIRE = "expire";


    private String status;
}
