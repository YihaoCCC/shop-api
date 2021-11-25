package com.example.shop.service;

import com.example.shop.pojo.GoodsVersion;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/21
 */
public interface GoodsVersionSer {
    int deleteByPrimaryKey(String key);

    List<GoodsVersion> queryByGoodsId(String goodsId);

    int insert(GoodsVersion record);

    int insertSelective(GoodsVersion record);

    GoodsVersion selectByPrimaryKey(String key);

    int updateByPrimaryKeySelective(GoodsVersion record);

    int updateByPrimaryKey(GoodsVersion record);
}
