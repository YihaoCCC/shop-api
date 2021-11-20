package com.example.shop.service;

import com.example.shop.pojo.ShoppingCart;
import com.example.shop.pojo.ShoppingCartKey;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface ShoppingCartSer {
    int deleteByPrimaryKey(ShoppingCartKey key);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(ShoppingCartKey key);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
}
