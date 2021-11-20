package com.example.shop.mapper;

import com.example.shop.pojo.ShoppingCart;
import com.example.shop.pojo.ShoppingCartKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface ShoppingCartDao {
    int deleteByPrimaryKey(ShoppingCartKey key);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(ShoppingCartKey key);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
}