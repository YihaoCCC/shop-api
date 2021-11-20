package com.example.shop.service.impl;

import com.example.shop.mapper.GoodsKindDao;
import com.example.shop.pojo.GoodsKind;
import com.example.shop.service.GoodsKindSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class GoodsKindImp implements GoodsKindSer {
    @Autowired(required = false)
    private GoodsKindDao goodsKindDao;

    @Override
    public int deleteByPrimaryKey(Integer kindId) {
        return goodsKindDao.deleteByPrimaryKey(kindId);
    }

    @Override
    public int insert(GoodsKind record) {
        return goodsKindDao.insert(record);
    }

    @Override
    public int insertSelective(GoodsKind record) {
        return goodsKindDao.insertSelective(record);
    }

    @Override
    public GoodsKind selectByPrimaryKey(Integer kindId) {
        return goodsKindDao.selectByPrimaryKey(kindId);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsKind record) {
        return goodsKindDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsKind record) {
        return goodsKindDao.updateByPrimaryKey(record);
    }
}
