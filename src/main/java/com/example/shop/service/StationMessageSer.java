package com.example.shop.service;

import com.example.shop.pojo.StationMessage;

import java.util.List;

public interface StationMessageSer {
    int deleteByPrimaryKey(String messageId);

    int insert(StationMessage record);

    int insertSelective(StationMessage record);

    StationMessage selectByPrimaryKey(String messageId);
    List<StationMessage> queryAll();
    int updateByPrimaryKeySelective(StationMessage record);

    int updateByPrimaryKey(StationMessage record);
}
