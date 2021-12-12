package com.example.shop.service.impl;

import com.example.shop.mapper.GoodsPromotionDao;
import com.example.shop.mapper.ShoppingCartDao;
import com.example.shop.pojo.*;
import com.example.shop.service.ShoppingCartSer;
import com.example.shop.utils.DateUtils;
import com.example.shop.utils.GetMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
            System.out.println(hashSet.add(isChoses.get(i).getIsChose()));
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

    @Override
    public Cart computeTotal(List<CartList> list) {
        goodsPromotionDao.deletePastTime(DateUtils.getNowDate());
        Cart cart = new Cart();
        cart.setGoodsList(list);
        double total = 0;
        double oriTotal = 0;
        HashMap<String, List<CartList>> hashMap = GetMap.getMap(list);
        for (Map.Entry<String, List<CartList>> entry : hashMap.entrySet()) {
            List<CartList> cartLists = entry.getValue();
            double sum = 0;
            for (CartList cartList : cartLists) {
                sum += cartList.getPrice() * cartList.getNum();
            }
            if (entry.getKey() != null) {
                GoodsPromotion goodsPromotion = goodsPromotionDao.selectByPrimaryKey(cartLists.get(0).getGoodsId());
                oriTotal += sum;
                total += sum - ((int) sum / goodsPromotion.getPromotionFull()) * goodsPromotion.getPromotionSub();
            } else {
                oriTotal += sum;
                total += sum;
            }

        }
        cart.setOriTotal(oriTotal);
        cart.setTotal(total);
        return cart;
    }

}
