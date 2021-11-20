package com.example.shop.mapper;

import com.example.shop.pojo.StationMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface StationMessageDao {
    int deleteByPrimaryKey(String messageId);

    int insert(StationMessage record);

    int insertSelective(StationMessage record);

    StationMessage selectByPrimaryKey(String messageId);

    int updateByPrimaryKeySelective(StationMessage record);

    int updateByPrimaryKey(StationMessage record);
}