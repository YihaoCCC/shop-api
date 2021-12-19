package com.example.shop.service.impl;

import com.example.shop.mapper.CollectionDao;
import com.example.shop.pojo.CollectionKey;
import com.example.shop.pojo.Goods;
import com.example.shop.service.CollectionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CollectionSerImp implements CollectionSer {
    @Autowired(required = false)
    private CollectionDao collectionDao;

    @Override
    public int deleteByPrimaryKey(CollectionKey key) {
        return collectionDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(CollectionKey record) {
        return collectionDao.insert(record);
    }

    @Override
    public int insertSelective(CollectionKey record) {
        return collectionDao.insertSelective(record);
    }

    @Override
    public List<Goods> queryByUserId(String userId, int pageNum) {
        int pageSize = 8;
        int start = (pageNum - 1) * pageSize;
        return collectionDao.queryByUserId(userId,start,pageSize);
    }

    @Override
    public CollectionKey query(CollectionKey record) {
        return collectionDao.query(record);
    }
}
