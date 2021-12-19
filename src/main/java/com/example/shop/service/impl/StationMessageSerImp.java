package com.example.shop.service.impl;

import com.example.shop.mapper.StationMessageDao;
import com.example.shop.pojo.StationMessage;
import com.example.shop.service.StationMessageSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StationMessageSerImp implements StationMessageSer {
    @Autowired(required = false)
    private StationMessageDao stationMessageDao;
    @Override
    public int deleteByPrimaryKey(String messageId) {
        return stationMessageDao.deleteByPrimaryKey(messageId);
    }

    @Override
    public int insert(StationMessage record) {
        return stationMessageDao.insert(record);
    }

    @Override
    public int insertSelective(StationMessage record) {
        return stationMessageDao.insertSelective(record);
    }

    @Override
    public StationMessage selectByPrimaryKey(String messageId) {
        return stationMessageDao.selectByPrimaryKey(messageId);
    }

    @Override
    public List<StationMessage> queryAll() {
        return stationMessageDao.queryAll();
    }

    @Override
    public int updateByPrimaryKeySelective(StationMessage record) {
        return stationMessageDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StationMessage record) {
        return stationMessageDao.updateByPrimaryKey(record);
    }
}
