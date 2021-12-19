package com.example.shop.service.impl;

import com.example.shop.mapper.GoodsPromotionDao;
import com.example.shop.mapper.OrderDetailDao;
import com.example.shop.pojo.CartList;
import com.example.shop.pojo.ComplexOrder;
import com.example.shop.pojo.OrderDetail;
import com.example.shop.pojo.OrderDetailKey;
import com.example.shop.service.OrderDetailSer;
import com.example.shop.utils.GetMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class OrderDetailSerImp implements OrderDetailSer {
    @Autowired(required = false)
    private OrderDetailDao orderDetailDao;


    @Override
    public int deleteByPrimaryKey(OrderDetailKey key) {
        return orderDetailDao.deleteByPrimaryKey(key);
    }


    @Override
    public int insert(OrderDetail record) {
        return orderDetailDao.insert(record);
    }

    @Override
    public int insertSelective(OrderDetail record) {
        return orderDetailDao.insertSelective(record);
    }

    @Override
    public OrderDetail selectByPrimaryKey(OrderDetailKey key) {
        return orderDetailDao.selectByPrimaryKey(key);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderDetail record) {
        return orderDetailDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderDetail record) {
        return orderDetailDao.updateByPrimaryKey(record);
    }
}
