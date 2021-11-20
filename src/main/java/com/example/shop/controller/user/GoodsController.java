package com.example.shop.controller.user;

import com.example.shop.pojo.Goods;
import com.example.shop.service.GoodsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 根据商品名字查找商品
     */
    @GetMapping("/goods/queryByGoodsName/{goodsName}")
    public List<Goods> queryByGoodsName(@PathVariable(value = "goodsName") String goodsName) {

        return goodsSer.queryByGoodsName(goodsName);
    }

    /**
     * 获取全部商品
     */
    @GetMapping("/goods/pageNum/{pageNum}")
    private List<Goods> queryGoodsByPageNum(@PathVariable(value = "pageNum") int pageNum) {
        int start=(pageNum-1)*10;
        int end=pageNum*10;
        return goodsSer.queryGoodsByPageNum(start,end);
    }
    @PostMapping("/goods/add/goods")
    private int insert(@RequestBody Goods goods){
        return goodsSer.insert(goods);
    }
}
