package com.example.shop.controller.user;

import com.example.shop.pojo.*;
import com.example.shop.service.AddressSer;
import com.example.shop.service.OrderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OrderController {
    @Autowired
    private OrderSer orderSer;

    /**
     * 在购物车页面生成订单
     */
    @PostMapping("/order/setOrder/fromShopping")
    private String setOrder(@RequestBody GetReqBody body) {
        return orderSer.setOrder(body).getOrderId();
    }

    /**
     * 付款时订单详情
     */
    @GetMapping("/order/getOrder/fromLast/{orderId}")
    private ComplexOrder setOrder2(@PathVariable String orderId) {
        return orderSer.queryByOrderId(orderId);
    }

    /**
     * 获取订单
     * @param userId
     * @return
     */
    @GetMapping("/order/queryAll/{userId}/{pageNum}/{status}")
    private List<ComplexOrder> queryAll(@PathVariable String userId, @PathVariable int pageNum,
                                        @PathVariable String status) {
        return orderSer.queryAllByUserId(userId, pageNum, status);
    }

    /**
     * 支付订单
     */
    @GetMapping("/order/payTheOrder/{orderId}")
    private int payTheOrder(@PathVariable String orderId) {
        return orderSer.payTheOrder(orderId);
    }

    /**
     * 取消订单
     */
    @DeleteMapping("/order/deleteNotPayOrder/{orderId}")
    private int deleteNoPayOrder(@PathVariable String orderId) {
        return orderSer.deleteNotPayOrder(orderId);
    }
}
