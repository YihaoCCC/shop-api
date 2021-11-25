package com.example.shop.service.impl;

import com.example.shop.mapper.GoodsDao;
import com.example.shop.mapper.ShoppingCartDao;
import com.example.shop.pojo.CartList;
import com.example.shop.pojo.ShoppingCart;
import com.example.shop.pojo.ShoppingCartKey;
import com.example.shop.service.ShoppingCartSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class ShoppingCartSerImp implements ShoppingCartSer {
    @Autowired(required = false)
    private ShoppingCartDao shoppingCartDao;

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public int deleteByPrimaryKey(ShoppingCartKey key) {
        return shoppingCartDao.deleteByPrimaryKey(key);
    }

    @Override
    public List<CartList> queryByUserId(String userId) {
        return shoppingCartDao.queryByUserId(userId);
    }

    @Override
    public int insert(ShoppingCart record) {
        return shoppingCartDao.insert(record);
    }

    @Override
    public int insertSelective(ShoppingCart record) {
        return shoppingCartDao.insertSelective(record);
    }

    @Override
    public ShoppingCart selectByPrimaryKey(ShoppingCartKey key) {
        return shoppingCartDao.selectByPrimaryKey(key);
    }

    @Override
    public int updateByPrimaryKeySelective(ShoppingCart record) {
        return shoppingCartDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShoppingCart record) {
        return shoppingCartDao.updateByPrimaryKey(record);
    }
}
