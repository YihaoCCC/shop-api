package com.example.shop.mapper;

import com.example.shop.pojo.OrderDetail;
import com.example.shop.pojo.OrderDetailKey;

public interface OrderDetailDao {
    int deleteByPrimaryKey(OrderDetailKey key);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(OrderDetailKey key);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}