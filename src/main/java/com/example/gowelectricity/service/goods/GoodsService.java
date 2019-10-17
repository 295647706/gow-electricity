package com.example.gowelectricity.service.goods;

import com.example.gowelectricity.mapper.auto.GoodsMapper;
import com.example.gowelectricity.mapper.ext.GoodsExtMapper;
import com.example.gowelectricity.model.auto.Goods;
import com.example.gowelectricity.model.rsp.goods.GoodsRsp;
import com.example.gowelectricity.service.BaseService;
import com.example.gowelectricity.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName GoodsService
 * @Author lzn
 * @DATE 2019/10/16 9:27
 */
@Service
public class GoodsService extends BaseService<GoodsExtMapper, Goods> {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 根据id 查询详情
     * */
    public GoodsRsp get(Long id){
        GoodsRsp rsp = new GoodsRsp();
        if(id == null){
            id = 1L;
        }
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        BeanUtil.copyProperties(goods,rsp);
        if(null != rsp.getDetailImageUrl() && !rsp.getDetailImageUrl().equals("")){
            String[] urls = rsp.getDetailImageUrl().split(",");
            if(urls.length > 0){
                for(String url : urls){
                    rsp.getDetailUrl().add(url);
                }
            }
            rsp.setDetailImageUrl(null);
        }
        return rsp;
    }
}
