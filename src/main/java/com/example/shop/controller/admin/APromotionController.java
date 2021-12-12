package com.example.shop.controller.admin;

import com.example.shop.pojo.GoodsPromotion;
import com.example.shop.service.GoodsPromotionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/12/8
 */
@RestController
public class APromotionController {
    @Autowired
    private GoodsPromotionSer promotionSer;

    @PostMapping("/admin/promotion/add")
    public int add(@RequestBody GoodsPromotion goodsPromotion){
        return promotionSer.insert(goodsPromotion);
    }
}
