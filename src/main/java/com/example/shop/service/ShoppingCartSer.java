package com.example.shop.service;

import com.example.shop.pojo.*;

import java.util.List;


public interface ShoppingCartSer {
    Cart deleteByPrimaryKey(ShoppingCartKey key);
    int deleteByUserId(String userId);
    List<CartList> queryByUserId(String userId);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(ShoppingCartKey key);

    int updateByPrimaryKeySelective(ShoppingCart record);

    Cart updateByPrimaryKey(ShoppingCart record);

    Cart queryAllChoseByUserId(String userId);

    Cart computeTotal(List<CartList> list);
}
