package com.example.shop.service;

import com.example.shop.pojo.Review;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface ReviewSer {
    int deleteByPrimaryKey(String reviewId);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(String reviewId);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}
