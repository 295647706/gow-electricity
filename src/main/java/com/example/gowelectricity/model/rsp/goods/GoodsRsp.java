package com.example.gowelectricity.model.rsp.goods;

import com.example.gowelectricity.model.auto.Goods;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GoodsRsp
 * @Author lzn
 * @DATE 2019/10/16 11:22
 */
@Data
public class GoodsRsp extends Goods {

    //详情图片
    private List<String> detailUrl = new ArrayList<>();
}
