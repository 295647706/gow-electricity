package com.example.gowelectricity.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.sql.SqlHelper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.MapUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BaseService
 * @Author lzn
 * @DATE 2019/10/16 10:16
 */
public class BaseService<M extends BaseMapper<T>,T>  {

    @Autowired
    protected M baseMapper;

    @Transactional(rollbackFor = Exception.class)
    public int deleteById(Serializable id){
        return this.baseMapper.deleteById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public int deleteByMap(Map<String,Object> map){
        if(MapUtils.isEmpty(map)){
            throw new MybatisPlusException("删除条件 map 不能为空");
        }else{
            return this.baseMapper.deleteByMap(map);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public int delete(Wrapper<T> wrapper){
        return this.baseMapper.delete(wrapper);
    }

    @Transactional(rollbackFor = Exception.class)
    public int deleteBatchIds(Collection<? extends Serializable> idList){
        return this.baseMapper.deleteBatchIds(idList);
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateById(T entity){
        return this.baseMapper.updateById(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public int update(T entity,Wrapper<T> wrapper){
        return this.baseMapper.update(entity,wrapper);
    }

    public T selectById(Serializable id){
        return this.baseMapper.selectById(id);
    }

    public List<T> selectBatchIds(Collection<? extends Serializable> idList){
        return this.baseMapper.selectBatchIds(idList);
    }

    public List<T> selectByMap(Map<String,Object> map){
        return this.baseMapper.selectByMap(map);
    }

    public T selectOne(Wrapper<T> wrapper){
        return this.baseMapper.selectOne(wrapper);
    }

    public T selectOne(Map<String,Object> map){
        if(MapUtils.isEmpty(map)){
            throw new MybatisPlusException("查询条件 map 不能为空");
        }else{
            if(this.baseMapper.selectByMap(map).size() > 0) {
                return this.baseMapper.selectByMap(map).get(0);
            }
            return null;
        }
    }

    public Map<String,Object> selectMap(Wrapper<T> wrapper){
        return (Map)SqlHelper.getObject(this.baseMapper.selectMaps(wrapper));
    }

    public Object selectObj(Wrapper<T> wrapper){
        return SqlHelper.getObject(this.baseMapper.selectMaps(wrapper));
    }

    public int selectCount(Wrapper<T> wrapper){
        return SqlHelper.retCount(this.baseMapper.selectCount(wrapper));
    }

    public List<T> selectList(Wrapper<T> wrapper){
        return this.baseMapper.selectList(wrapper);
    }

    public Page<T> selectPage(Page<T> page,Wrapper<T> wrapper){
        return (Page<T>)this.baseMapper.selectPage(page,wrapper);
    }

    public Page<Map<String,Object>> selectMapsPage(Page<T> page,Wrapper<T> wrapper){
        return (Page<Map<String,Object>>)this.baseMapper.selectMapsPage(page,wrapper);
    }
}
