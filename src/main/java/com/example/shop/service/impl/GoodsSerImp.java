package com.example.shop.service.impl;

import com.example.shop.mapper.GoodsDao;
import com.example.shop.pojo.Goods;
import com.example.shop.service.GoodsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class GoodsSerImp implements GoodsSer {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public int deleteByPrimaryKey(String goodsId) {
        return goodsDao.deleteByPrimaryKey(goodsId);
    }

    @Override
    public List<Goods> queryGoodsByPageNum(int start,int end) {
        return goodsDao.queryGoodsByPageNum(start,end);
    }

    @Override
    public List<Goods> queryByGoodsName(String goodsName) {
        return goodsDao.queryByGoodsName(goodsName);
    }

    @Override
    public int insert(Goods record) {
        return goodsDao.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return goodsDao.insertSelective(record);
    }

    @Override
    public Goods selectByPrimaryKey(String goodsId) {
        return goodsDao.selectByPrimaryKey(goodsId);
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return goodsDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return goodsDao.updateByPrimaryKey(record);
    }
}
