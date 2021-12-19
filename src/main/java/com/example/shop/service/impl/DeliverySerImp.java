package com.example.shop.service.impl;

import com.example.shop.mapper.DeliveryDao;
import com.example.shop.pojo.Delivery;
import com.example.shop.service.DeliverySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;


@Service
public class DeliverySerImp implements DeliverySer {
    @Autowired(required = false)
    private DeliveryDao deliveryDao;
    @Override
    public int deleteByPrimaryKey(Integer deliveryId) {
        return deliveryDao.deleteByPrimaryKey(deliveryId);
    }

    @Override
    public int insert(Delivery record) {
        return 0;
    }

    @Override
    public int insertSelective(Delivery record) {
        return 0;
    }

    @Override
    public Delivery selectByPrimaryKey(Integer deliveryId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Delivery record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Delivery record) {
        return 0;
    }
}
