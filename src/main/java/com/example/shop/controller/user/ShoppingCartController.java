package com.example.shop.controller.user;

import com.example.shop.pojo.Cart;
import com.example.shop.pojo.CartList;
import com.example.shop.pojo.ShoppingCart;
import com.example.shop.pojo.ShoppingCartKey;
import com.example.shop.service.ShoppingCartSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/24
 */
@RestController
public class ShoppingCartController {
    @Autowired
    private ShoppingCartSer shoppingCartSer;

    /**
     * 在购物车页面对购物车的某个商品进行修改
     * @param shoppingCart
     */
    @PostMapping("/shoppingCart/modify")
    private Cart addShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        return shoppingCartSer.updateByPrimaryKey(shoppingCart);
    }

    /**
     * 在商品页面添加商品到购物车
     * @param shoppingCart
     */
    @PostMapping("/shoppingCart/addOnce")
    private int addOnce(@RequestBody ShoppingCart shoppingCart) {
        ShoppingCart result = shoppingCartSer.selectByPrimaryKey(shoppingCart);
        if (result == null) {
            return shoppingCartSer.insert(shoppingCart);
        } else {
            result.setGoodsNumber(result.getGoodsNumber() + 1);
            shoppingCartSer.updateByPrimaryKey(result);
            return 1;
        }
    }

    /**
     * 删除购物车的某个商品
     * @param  shoppingCartKey
     */
    @PostMapping("/shoppingCart/delete")
    private Cart deleteByBody(@RequestBody ShoppingCartKey shoppingCartKey) {
        return shoppingCartSer.deleteByPrimaryKey(shoppingCartKey);
    }

    /**
     *根据用户id获取用户的购物车信息
     * @param userId
     */
    @GetMapping("/shoppingCart/queryByUserId/{userId}")
    private Cart queryByUserId(@PathVariable String userId){
        Cart cart = shoppingCartSer.computeTotal(shoppingCartSer.queryByUserId(userId));
        return cart;

    }

    @GetMapping("/shoppingCart/chooseAll/{userId}")
    private  Cart chooseAll(@PathVariable String userId){
        return shoppingCartSer.queryAllChoseByUserId(userId);
    }
}
