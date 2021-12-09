package com.example.shop.service;

import com.example.shop.pojo.GoodsKind;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
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
