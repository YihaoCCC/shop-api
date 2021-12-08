package com.example.shop.mapper;

import com.example.shop.pojo.ComplexOrder;
import com.example.shop.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByOrderId(String orderId, String status);

    int updateByPrimaryKey(Order record);

    ComplexOrder queryByOrderId(String orderId);

    int CountOrderNumber();

    List<ComplexOrder> queryAllByUserId(String userId, int start, int pageSize, String status);

    List<ComplexOrder> queryAll(int start, int pageSize);

    int deleteNotPayOrder(String orderId);
}