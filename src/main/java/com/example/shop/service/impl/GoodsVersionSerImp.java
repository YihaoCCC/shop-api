package com.example.shop.service.impl;

import com.example.shop.mapper.GoodsVersionDao;
import com.example.shop.pojo.GoodsVersion;
import com.example.shop.service.GoodsVersionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/21
 */
@Service
public class GoodsVersionSerImp implements GoodsVersionSer {
    @Autowired
    private GoodsVersionDao goodsVersionDao;


    @Override
    public int deleteByPrimaryKey(String key) {
        return goodsVersionDao.deleteByPrimaryKey(key);
    }

    @Override
    public List<GoodsVersion> queryByGoodsId(String goodsId) {
        return goodsVersionDao.queryByGoodsId(goodsId);
    }

    @Override
    public int insert(GoodsVersion record) {
        return goodsVersionDao.insert(record);
    }

    @Override
    public int insertSelective(GoodsVersion record) {
        return goodsVersionDao.insertSelective(record);
    }

    @Override
    public GoodsVersion selectByPrimaryKey(String key) {
        return goodsVersionDao.selectByPrimaryKey(key);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsVersion record) {
        return goodsVersionDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsVersion record) {
        return goodsVersionDao.updateByPrimaryKey(record);
    }
}
