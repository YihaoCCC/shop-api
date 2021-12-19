package com.example.shop.service;

import com.example.shop.pojo.ComplexOrder;
import com.example.shop.pojo.Review;


public interface ReviewSer {
    int deleteByPrimaryKey(String reviewId);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(String reviewId);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review recor);
}
