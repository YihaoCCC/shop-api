package com.example.shop.mapper;

import com.example.shop.pojo.Goods;
import com.example.shop.pojo.GoodsDetailReview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {
    int deleteByPrimaryKey(String goodsId);

    List<Goods> queryGoodsByPageNum(int start ,int size);

    List<Goods> queryByGoodsName(String goodsName);

    int insert(Goods record);

    int insertSelective(Goods record);

    GoodsDetailReview selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    Goods getGoodsByGoodsId(String goodsId);
}