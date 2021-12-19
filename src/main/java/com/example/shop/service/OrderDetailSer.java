package com.example.shop.service;

import com.example.shop.pojo.CartList;
import com.example.shop.pojo.ComplexOrder;
import com.example.shop.pojo.OrderDetail;
import com.example.shop.pojo.OrderDetailKey;

import java.util.List;


public interface OrderDetailSer {
    int deleteByPrimaryKey(OrderDetailKey key);



    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(OrderDetailKey key);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}
