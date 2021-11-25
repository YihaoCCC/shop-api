package com.example.shop.mapper;

import com.example.shop.pojo.ComplexOrder;
import com.example.shop.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface OrderDao {
    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    ComplexOrder queryByOrderId(String orderId);

    List<ComplexOrder> queryAllByUserId(String userId,int start,int pageSize,String status);

    int deleteNotPayOrder(String orderId);
}