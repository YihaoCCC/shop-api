package com.example.shop.service;

import com.example.shop.pojo.AComplexOrder;
import com.example.shop.pojo.ComplexOrder;
import com.example.shop.pojo.GetReqBody;
import com.example.shop.pojo.Order;

import java.util.List;


public interface OrderSer {
    int deleteByPrimaryKey(String orderId);


    ComplexOrder setOrder(GetReqBody payOrNot);

    int insertSelective(Order order);

    Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    ComplexOrder queryByOrderId(String orderId);

    int updateByOrderId(String orderId, String status);
    int CountOrderNumber();
    List<ComplexOrder> queryAllByUserId(String userId, int pageNum, String status);

    AComplexOrder queryAll(int pageNum);

    int payTheOrder(String orderId);

    int deleteNotPayOrder(String orderId);
}
