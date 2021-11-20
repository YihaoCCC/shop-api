package com.example.shop.mapper;

import com.example.shop.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {
    int deleteByPrimaryKey(String goodsId);

    List<Goods> queryAllGoods();

    List<Goods> queryByGoodsName(String goodsName);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}