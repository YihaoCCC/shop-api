package com.example.shop.controller.user;

import com.example.shop.pojo.GoodsVersion;
import com.example.shop.service.GoodsVersionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class GoodsVersionCon {
    @Autowired
    private GoodsVersionSer goodsVersionSer;

    /**
     * 查看商品规格
     * @param goodsId
     * @return
     */
    @GetMapping("/goods/queryByGoodsId/{goodsId}")
    private List<GoodsVersion> queryBygoodsId(@PathVariable(value = "goodsId") String goodsId) {
        return goodsVersionSer.queryByGoodsId(goodsId);
    }
}
