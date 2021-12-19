package com.example.shop.controller.admin;

import com.example.shop.pojo.AComplexOrder;
import com.example.shop.pojo.ComplexOrder;
import com.example.shop.service.OrderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AOrderController {
    @Autowired
    private OrderSer orderSer;

    /**
     * 获取全部订单
     *
     * @param pageNum
     * @return
     */
    @GetMapping("/admin/order/queryAll/{pageNum}")
    private AComplexOrder queryAll(@PathVariable int pageNum) {

        return orderSer.queryAll(pageNum);
    }

    @GetMapping("/admin/order/modify/{orderId}/{status}")
    private int modifyOrder(@PathVariable String orderId, @PathVariable String status) {
        return orderSer.updateByOrderId(orderId,status);
    }
}
