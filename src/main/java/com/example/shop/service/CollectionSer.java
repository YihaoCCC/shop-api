package com.example.shop.service;

import com.example.shop.pojo.CollectionKey;
import com.example.shop.pojo.Goods;

import java.util.List;



public interface CollectionSer {
    int deleteByPrimaryKey(CollectionKey key);

    int insert(CollectionKey record);

    int insertSelective(CollectionKey record);

    List<Goods> queryByUserId(String userId, int pageNum);

    CollectionKey query(CollectionKey record);
}
