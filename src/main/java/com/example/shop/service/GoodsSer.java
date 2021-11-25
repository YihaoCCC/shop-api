package com.example.shop.service;

import com.example.shop.pojo.Goods;
import com.example.shop.pojo.GoodsDetailReview;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface GoodsSer {
    int deleteByPrimaryKey(String goodsId);

    List<Goods> queryGoodsByPageNum(int start,int end);

    List<Goods> queryByGoodsName(String goodsName);
    int insert(Goods record);

    int insertSelective(Goods record);

    GoodsDetailReview selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}
