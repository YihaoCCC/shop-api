package com.example.shop.mapper;

import com.example.shop.pojo.GoodsVersion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsVersionDao {
    int deleteByPrimaryKey(String key);

    List<GoodsVersion> queryByGoodsId(String goodsId);

    int insert(GoodsVersion record);

    int insertSelective(GoodsVersion record);

    GoodsVersion selectByPrimaryKey(String key);

    int updateByPrimaryKeySelective(GoodsVersion record);

    int updateByPrimaryKey(GoodsVersion record);
    GoodsVersion selectByVersionId(String versionId);

}