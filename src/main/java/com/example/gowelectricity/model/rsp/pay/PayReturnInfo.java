package com.example.gowelectricity.model.rsp.pay;

import lombok.Data;

/**
 * @ClassName PayReturnInfo
 * @Author lzn
 * @DATE 2019/11/7 17:10
 */
@Data
public class PayReturnInfo {

    /****************************************提示代码编号**********************************/
    //成功
    public static final String STATUS_OK = "ok";
    //签名错误
    public static final String STATUS_SIGN_ERROR = "sign_error";
    //订单已支付
    public static final String STATUS_ORDER_PAYED = "order_payed";
    //订单已过期
    public static final String STATUS_ORDER_EXPIRE = "order_expire";
    //免费版达到每日订单限制
    public static final String STATUS_FREE_LIMIT = "free_limit";
    //余额不足
    public static final String STATUS_FEE_ERROR = "fee_error";
    //无可用二维码，可能是达到设置收款额度上限
    public static final String STATUS_QR_LIMIT = "qr_limit";


    private int payId;

    private String status;

    private String aoid;

    private String pay_type;

    private String price;

    private String qr_price;

    private String qr;

    private String qr_img;

    private Long cid;

    private Long expires_in;

    private String return_url;

    private String feedback_url;
}
