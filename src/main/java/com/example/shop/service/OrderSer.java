package com.example.shop.service;

import com.example.shop.pojo.Order;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface OrderSer {
    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
