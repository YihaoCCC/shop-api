package com.example.shop.service;

import com.example.shop.pojo.Delivery;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface DeliverySer {
    int deleteByPrimaryKey(Integer deliveryId);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    Delivery selectByPrimaryKey(Integer deliveryId);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);
}
