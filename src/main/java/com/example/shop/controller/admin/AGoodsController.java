package com.example.shop.controller.admin;

import com.example.shop.pojo.GoodsDetailReview;
import com.example.shop.service.GoodsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/12/9
 */
@RestController
public class AGoodsController {
    @Autowired
    private GoodsSer goodsSer;

    @GetMapping("/admin/queryAll/{pageNum}")
    private List<GoodsDetailReview> queryAll(@PathVariable int pageNum) {
        return goodsSer.queryAll(pageNum);
    }

    @DeleteMapping("/admin/deleteGoods/{goodsId}")
    private int deleteByGoodsId(@PathVariable String goodsId) {
        return goodsSer.deleteByPrimaryKey(goodsId);
    }

    @PostMapping("/admin/addGoods")
    private int addGoods(@RequestBody GoodsDetailReview goodsDetailReview) {
        return goodsSer.insertMulti(goodsDetailReview);
    }
}
