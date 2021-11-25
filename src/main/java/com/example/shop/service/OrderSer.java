package com.example.shop.service;

import com.example.shop.pojo.*;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface OrderSer {
    int deleteByPrimaryKey(String orderId);


    ComplexOrder setOrder(GetReqBody payOrNot);

    int insertSelective(Order order);

    Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    ComplexOrder queryByOrderId(String orderId);

    List<ComplexOrder> queryAllByUserId(String userId,int pageNum,String status);

    int payTheOrder(String orderId);

    int deleteNotPayOrder(String orderId);
}
