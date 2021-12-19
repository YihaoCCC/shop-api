package com.example.shop.service;

import com.example.shop.pojo.Goods;
import com.example.shop.pojo.GoodsDetailReview;

import java.util.List;


public interface GoodsSer {
    int insertMulti(GoodsDetailReview goodsDetailReview);

    int deleteByPrimaryKey(String goodsId);

    List<Goods> queryGoodsByPageNum(int start, int end);

    List<Goods> queryByGoodsName(String goodsName);
    List<GoodsDetailReview> findByGoodsName(String goodsName);
    int insert(Goods record);

    int insertSelective(Goods record);

    List<GoodsDetailReview> queryAll(int pageNum);

    GoodsDetailReview selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}
