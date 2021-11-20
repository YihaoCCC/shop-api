package com.example.shop.mapper;

import com.example.shop.pojo.Review;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface ReviewDao {
    int deleteByPrimaryKey(String reviewId);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(String reviewId);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}