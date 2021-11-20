package com.example.shop.service;

import com.example.shop.pojo.StationMessage;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface StationMessageSer {
    int deleteByPrimaryKey(String messageId);

    int insert(StationMessage record);

    int insertSelective(StationMessage record);

    StationMessage selectByPrimaryKey(String messageId);

    int updateByPrimaryKeySelective(StationMessage record);

    int updateByPrimaryKey(StationMessage record);
}
