package com.example.shop.service;

import com.example.shop.pojo.GoodsKind;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface GoodsKindSer {
    int deleteByPrimaryKey(Integer kindId);

    int insert(GoodsKind record);

    int insertSelective(GoodsKind record);

    GoodsKind selectByPrimaryKey(Integer kindId);

    int updateByPrimaryKeySelective(GoodsKind record);

    int updateByPrimaryKey(GoodsKind record);
}
