package com.example.shop.service.impl;

import com.example.shop.mapper.OrderDao;
import com.example.shop.pojo.Order;
import com.example.shop.service.OrderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class OrderSerImp implements OrderSer {
    @Autowired(required = false)
    private OrderDao orderDao;
    @Override
    public int deleteByPrimaryKey(String orderId) {
        return orderDao.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insert(Order record) {
        return orderDao.insert(record);
    }

    @Override
    public int insertSelective(Order record) {
        return orderDao.insertSelective(record);
    }

    @Override
    public Order selectByPrimaryKey(String orderId) {
        return orderDao.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return orderDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return orderDao.updateByPrimaryKey(record);
    }
}
