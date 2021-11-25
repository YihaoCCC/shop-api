package com.example.shop.controller.user;

import com.example.shop.pojo.Goods;
import com.example.shop.pojo.GoodsDetailReview;
import com.example.shop.service.GoodsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@RestController
@CrossOrigin
public class GoodsController {
    @Autowired
    private GoodsSer goodsSer;

    /**
     * 根据商品名字查找商品
     * @param  goodsName
     */
    @GetMapping("/goods/queryByGoodsName/{goodsName}")
    public List<Goods> queryByGoodsName(@PathVariable(value = "goodsName") String goodsName) {
        return goodsSer.queryByGoodsName(goodsName);
    }

    /**
     * 获取全部商品
     * @param pageNum
     */
    @GetMapping("/goods/pageNum/{pageNum}")
    public List<Goods> queryGoodsByPageNum(@PathVariable(value = "pageNum") int pageNum) {
        int start = (pageNum - 1) * 10;
        int pageSize = 10;
        List<Goods> oriGoods = goodsSer.queryGoodsByPageNum(start, pageSize);
        if (oriGoods.size() == pageSize) {
            return oriGoods;
        } else if (oriGoods.size() >= 5 && oriGoods.size() < pageSize){
            return oriGoods.subList(0,5);
        }
            return new ArrayList();
    }

    /**
     * 获取商品详情
     * @param goodsId
     */
    @GetMapping("/goods/goodsDetail/{goodsId}")
    public GoodsDetailReview queryGoodsDetailByGoodsId(@PathVariable(value = "goodsId") String goodsId) {
        return goodsSer.selectByPrimaryKey(goodsId);
    }

    /**
     * 添加商品
     * @param goods
     * @return
     */
    public int insertGoods(@RequestBody Goods goods){
        return  goodsSer.insert(goods);
    }
}
