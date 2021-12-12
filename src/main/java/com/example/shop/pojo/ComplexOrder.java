package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplexOrder {
    private String orderId;

    private String orderStatus;

    private String orderTime;

    private Double oriAmount;

    private Double realAmount;

    private Integer deliveryId;

    private Integer usePoint;

    private String addressId;

    private Address address;

    private List<OrderDetail> orderDetails;

}
