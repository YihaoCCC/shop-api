package com.example.shop.service.impl;

import com.example.shop.mapper.GoodsDao;
import com.example.shop.mapper.GoodsKindDao;
import com.example.shop.mapper.GoodsPromotionDao;
import com.example.shop.mapper.GoodsVersionDao;
import com.example.shop.pojo.Goods;
import com.example.shop.pojo.GoodsDetailReview;
import com.example.shop.pojo.GoodsVersion;
import com.example.shop.service.GoodsSer;
import com.example.shop.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class GoodsSerImp implements GoodsSer {
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private GoodsVersionDao goodsVersiondao;
    @Autowired
    private GoodsPromotionDao goodsPromotionDao;
    @Autowired
    private GoodsKindDao goodsKindDao;

    @Override
    public int insertMulti(GoodsDetailReview goodsDetailReview) {
        List<GoodsVersion> goodsVersions = goodsDetailReview.getGoodsVersions();
        String goodsId = UUID.randomUUID().toString().replace("-", "");
        double minPrice = Integer.MAX_VALUE;
        String url = null;
        int totalInvn = 0;
        for (int i = 0; i < goodsVersions.size(); i++) {
            if (goodsVersions.get(i).getGoodsPrice() < minPrice) {
                minPrice = goodsVersions.get(i).getGoodsPrice();
                url = goodsVersions.get(i).getVersionPhotoUrl();
            }
            totalInvn += goodsVersions.get(i).getVersionInvn();
            goodsVersions.get(i).setGoodsId(goodsId);
        }
        Goods goods = new Goods(goodsId, goodsDetailReview.getGoodsName(),goodsDetailReview.getGoodsKindId()
                , goodsDetailReview.getGoodsIsSelf(), goodsDetailReview.getGoodsDetail()
                , 1, totalInvn, minPrice, url);
        int res = goodsDao.insert(goods);
        for (GoodsVersion goodsVersion : goodsVersions) {
            goodsVersiondao.insert(goodsVersion);
        }
        return res;
    }

    @Override
    public int deleteByPrimaryKey(String goodsId) {
        return goodsDao.deleteByPrimaryKey(goodsId);
    }

    @Override
    public List<Goods> queryGoodsByPageNum(int start, int end) {
        return goodsDao.queryGoodsByPageNum(start, end);
    }

    @Override
    public List<Goods> queryByGoodsName(String goodsName) {
        return goodsDao.queryByGoodsName(goodsName);
    }

    @Override
    public List<GoodsDetailReview> findByGoodsName(String goodsName) {
        return goodsDao.findByGoodsName(goodsName);
    }

    @Override
    public int insert(Goods record) {
        return goodsDao.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return goodsDao.insertSelective(record);
    }

    @Override
    public List<GoodsDetailReview> queryAll(int pageNum) {
        goodsPromotionDao.deletePastTime(DateUtils.getNowDate());
        int pageSize = 7;
        int start = (pageNum - 1) * pageSize;
        return goodsDao.queryAll(start, pageSize);
    }

    @Override
    public GoodsDetailReview selectByPrimaryKey(String goodsId) {
        goodsPromotionDao.deletePastTime(DateUtils.getNowDate());
        return goodsDao.selectByPrimaryKey(goodsId);
    }


    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return goodsDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goods record) {

        return goodsDao.updateByPrimaryKey(record);
    }
}
