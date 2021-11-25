package com.example.shop.mapper;

import com.example.shop.pojo.GoodsPromotion;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface GoodsPromotionDao {
    int deleteByPrimaryKey(String goodsId);

    int insert(GoodsPromotion record);

    int insertSelective(GoodsPromotion record);

    GoodsPromotion selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(GoodsPromotion record);

    int updateByPrimaryKey(GoodsPromotion record);
    int deletePastTime(String date);
}