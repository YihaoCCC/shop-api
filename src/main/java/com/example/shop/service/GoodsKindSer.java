package com.example.shop.service;

import com.example.shop.pojo.GoodsKind;

import java.util.List;


public interface GoodsKindSer {
    int deleteByPrimaryKey(Integer kindId);
    int getByKindName(String kindName);
    int insert(GoodsKind record);
    List<GoodsKind> queryAll();
    int insertSelective(GoodsKind record);

    GoodsKind selectByPrimaryKey(Integer kindId);

    int updateByPrimaryKeySelective(GoodsKind record);

    int updateByPrimaryKey(GoodsKind record);
}
