package com.example.shop.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * order
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    private String orderId;

    private String userId;

    private String orderStatus;

    private Date orderTime;

    private Double orderAmount;

    private String addressId;

    private Integer deliveryId;

    private static final long serialVersionUID = 1L;
}