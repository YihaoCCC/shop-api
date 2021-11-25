package com.example.shop.service;

import com.example.shop.pojo.Cart;
import com.example.shop.pojo.CartList;
import com.example.shop.pojo.ShoppingCart;
import com.example.shop.pojo.ShoppingCartKey;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface ShoppingCartSer {
    int deleteByPrimaryKey(ShoppingCartKey key);

    List<CartList> queryByUserId(String userId);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(ShoppingCartKey key);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
}
