package com.example.shop.service;

import com.example.shop.pojo.GoodsPromotion;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface GoodsPromotionSer {
    int deleteByPrimaryKey(String goodsId);

    int insert(GoodsPromotion record);

    int insertSelective(GoodsPromotion record);

    GoodsPromotion selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(GoodsPromotion record);

    int updateByPrimaryKey(GoodsPromotion record);
    int deletePastTime(String date);
}
