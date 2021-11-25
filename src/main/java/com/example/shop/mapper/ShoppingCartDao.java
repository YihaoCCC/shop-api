package com.example.shop.mapper;

import com.example.shop.pojo.CartList;
import com.example.shop.pojo.IsChose;
import com.example.shop.pojo.ShoppingCart;
import com.example.shop.pojo.ShoppingCartKey;

import java.util.List;

public interface ShoppingCartDao {
    int deleteByPrimaryKey(ShoppingCartKey key);

    int deleteByUserId(String userId);

    int insert(ShoppingCart record);

    List<CartList> queryByUserId(String userId);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(ShoppingCartKey key);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);

    List<IsChose> queryAllChoseByUserId(String userId);

    int updateChoseByUserId(String userId, int isChose);
}