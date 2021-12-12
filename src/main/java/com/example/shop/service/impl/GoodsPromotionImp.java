package com.example.shop.service.impl;

import com.example.shop.mapper.GoodsPromotionDao;
import com.example.shop.pojo.GoodsPromotion;
import com.example.shop.service.GoodsPromotionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class GoodsPromotionImp implements GoodsPromotionSer {
    @Autowired(required = false)
    private GoodsPromotionDao goodsPromotionDao;
    @Override
    public int deleteByPrimaryKey(String goodsId) {
        return goodsPromotionDao.deleteByPrimaryKey(goodsId);
    }

    @Override
    public int insert(GoodsPromotion record) {
        record.setPromotionKind("满减");
        String detail = "满"+record.getPromotionFull()+"减"+record.getPromotionSub();
        record.setPromotionDetail(detail);
        return goodsPromotionDao.insert(record);
    }

    @Override
    public int insertSelective(GoodsPromotion record) {
        return goodsPromotionDao.insertSelective(record);
    }

    @Override
    public GoodsPromotion selectByPrimaryKey(String goodsId) {
        return goodsPromotionDao.selectByPrimaryKey(goodsId);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsPromotion record) {
        return goodsPromotionDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsPromotion record) {
        return goodsPromotionDao.updateByPrimaryKey(record);
    }

    @Override
    public int deletePastTime(String date) {
        return goodsPromotionDao.deletePastTime(date);
    }
}
