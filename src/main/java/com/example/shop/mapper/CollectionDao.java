package com.example.shop.mapper;


import com.example.shop.pojo.CollectionKey;
import com.example.shop.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface CollectionDao {
    int deleteByPrimaryKey(CollectionKey key);

    int insert(CollectionKey record);

    int insertSelective(CollectionKey record);

    List<CollectionKey> queryByUserId(String userId);
}