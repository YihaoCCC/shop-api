package com.example.shop.service.impl;

import com.example.shop.mapper.ReviewDao;
import com.example.shop.pojo.ComplexOrder;
import com.example.shop.pojo.Review;
import com.example.shop.service.OrderSer;
import com.example.shop.service.ReviewSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class ReviewSerImp implements ReviewSer {
    @Autowired(required = false)
    private ReviewDao reviewDao;
    @Autowired
    private OrderSer orderSer;
    @Override
    public int deleteByPrimaryKey(String reviewId) {
        return reviewDao.deleteByPrimaryKey(reviewId);
    }

    @Override
    public int insert(Review record) {
        return reviewDao.insert(record);
    }

    @Override
    public int insertSelective(Review record) {
        return reviewDao.insertSelective(record);
    }

    @Override
    public Review selectByPrimaryKey(String reviewId) {
        return reviewDao.selectByPrimaryKey(reviewId);
    }

    @Override
    public int updateByPrimaryKeySelective(Review record) {
        return reviewDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Review record) {
        return reviewDao.updateByPrimaryKey(record);
    }

    @Override
    public ComplexOrder queryByOrderId(String orderId) {
        return orderSer.queryByOrderId(orderId);
    }
}
