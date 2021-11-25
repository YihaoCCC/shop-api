package com.example.shop.service.impl;

import com.example.shop.mapper.GoodsDao;
import com.example.shop.mapper.GoodsPromotionDao;
import com.example.shop.mapper.ShoppingCartDao;
import com.example.shop.pojo.*;
import com.example.shop.service.ShoppingCartSer;
import com.example.shop.utils.DateUtils;
import com.example.shop.utils.GetMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class ShoppingCartSerImp implements ShoppingCartSer {
    @Autowired(required = false)
    private ShoppingCartDao shoppingCartDao;
    @Autowired
    private GoodsPromotionDao goodsPromotionDao;

    @Override
    public Cart deleteByPrimaryKey(ShoppingCartKey key) {
        shoppingCartDao.deleteByPrimaryKey(key);
        return computeTotal(shoppingCartDao.queryByUserId(key.getUserId()));
    }

    @Override
    public int deleteByUserId(String userId) {
        return shoppingCartDao.deleteByUserId(userId);
    }

    @Override
    public List<CartList> queryByUserId(String userId) {
        goodsPromotionDao.deletePastTime(DateUtils.getNowDate());
        return shoppingCartDao.queryByUserId(userId);
    }

    @Override
    public int insert(ShoppingCart record) {
        return shoppingCartDao.insert(record);
    }

    @Override
    public int insertSelective(ShoppingCart record) {
        return shoppingCartDao.insertSelective(record);
    }

    @Override
    public ShoppingCart selectByPrimaryKey(ShoppingCartKey key) {
        goodsPromotionDao.deletePastTime(DateUtils.getNowDate());
        return shoppingCartDao.selectByPrimaryKey(key);
    }

    @Override
    public int updateByPrimaryKeySelective(ShoppingCart record) {
        goodsPromotionDao.deletePastTime(DateUtils.getNowDate());
        return shoppingCartDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public Cart updateByPrimaryKey(ShoppingCart record) {
        goodsPromotionDao.deletePastTime(DateUtils.getNowDate());
        shoppingCartDao.updateByPrimaryKey(record);
        return computeTotal(shoppingCartDao.queryByUserId(record.getUserId()));
    }

    @Override
    public Cart queryAllChoseByUserId(String userId) {
        goodsPromotionDao.deletePastTime(DateUtils.getNowDate());
        List<IsChose> isChoses = shoppingCartDao.queryAllChoseByUserId(userId);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < isChoses.size(); i++) {
            hashSet.add(isChoses.get(i).getIsChose());
        }
        if (hashSet.size() == 2) {
            shoppingCartDao.updateChoseByUserId(userId, 1);
        } else if (hashSet.contains(1)) {
            shoppingCartDao.updateChoseByUserId(userId, 0);
        } else {
            shoppingCartDao.updateChoseByUserId(userId, 1);
        }
        shoppingCartDao.queryByUserId(userId);
        return computeTotal(shoppingCartDao.queryByUserId(userId));
    }
}
