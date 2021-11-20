package com.example.shop.service;

import com.example.shop.pojo.OrderDetail;
import com.example.shop.pojo.OrderDetailKey;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface OrderDetailSer {
    int deleteByPrimaryKey(OrderDetailKey key);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(OrderDetailKey key);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}
