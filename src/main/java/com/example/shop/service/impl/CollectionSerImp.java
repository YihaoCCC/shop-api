package com.example.shop.service.impl;

import com.example.shop.mapper.CollectionDao;
import com.example.shop.pojo.CollectionKey;
import com.example.shop.pojo.Goods;
import com.example.shop.service.CollectionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class CollectionSerImp implements CollectionSer {
    @Autowired(required = false)
    private CollectionDao collectionDao;

    @Autowired
    private GoodsDao goodsDao;

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
    public Collect queryByUserId(String userId) {
        List<CollectionKey> list = collectionDao.queryByUserId(userId);
        Collect collect = new Collect();
        collect.setUserId(userId);
        List<Goods> goodsList = new ArrayList<>();
        if(list.size() > 0){
            for (CollectionKey c: list) {
                goodsList.add(goodsDao.getGoodsByGoodsId(c.getGoodsId()));
            }
        }
        collect.setGoodsList(goodsList);
        return collect;
    }
}
