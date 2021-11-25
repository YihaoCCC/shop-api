package com.example.shop.service;

import com.example.shop.pojo.Collect;
import com.example.shop.pojo.CollectionKey;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface CollectionSer {
    int deleteByPrimaryKey(CollectionKey key);

    int insert(CollectionKey record);

    int insertSelective(CollectionKey record);
}
