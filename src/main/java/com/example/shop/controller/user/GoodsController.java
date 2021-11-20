package com.example.shop.controller.user;

import com.example.shop.pojo.Goods;
import com.example.shop.service.GoodsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@RestController
public class GoodsController {
    @Autowired
    private GoodsSer goodsSer;
/**根据商品名字查找商品
 * */
    @GetMapping("/goods/queryByGoodsName/{goodsName}")
    public List<Goods> queryByGoodsName(@PathVariable(value = "goodsName") String goodsName) {
        return goodsSer.queryByGoodsName(goodsName);
    }

    /**
     * 获取全部商品
     */
    @GetMapping("/goods/All")
    private List<Goods> queryAllGoods() {
        return goodsSer.queryAllGoods();
    }
}
