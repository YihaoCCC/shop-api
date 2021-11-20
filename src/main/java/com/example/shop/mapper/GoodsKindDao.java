package com.example.shop.mapper;

import com.example.shop.pojo.GoodsKind;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface GoodsKindDao {
    int deleteByPrimaryKey(Integer kindId);

    int insert(GoodsKind record);

    int insertSelective(GoodsKind record);

    GoodsKind selectByPrimaryKey(Integer kindId);

    int updateByPrimaryKeySelective(GoodsKind record);

    int updateByPrimaryKey(GoodsKind record);
}