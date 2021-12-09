package com.example.shop.mapper;

import com.example.shop.pojo.GoodsKind;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsKindDao {
    int getByKindName(String kindName);

    int deleteByPrimaryKey(Integer kindId);

    List<GoodsKind> queryAll();

    int insert(GoodsKind record);

    int insertSelective(GoodsKind record);

    GoodsKind selectByPrimaryKey(Integer kindId);

    int updateByPrimaryKeySelective(GoodsKind record);

    int updateByPrimaryKey(GoodsKind record);
}