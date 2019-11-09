package com.example.gowelectricity.model.rsp;

import lombok.Data;

/**
 * @ClassName ResultRsp
 * @Author lzn
 * @DATE 2019/10/17 14:19
 */
@Data
public class ResultRsp {

    //0成功,其他失败
    private int status = 0;

    private Object data;

    private String msg;

    public ResultRsp(){}

    public ResultRsp(int status,Object data,String msg){
        this.status = status;
        this.data = data;
        this.msg = msg;
    }
}
