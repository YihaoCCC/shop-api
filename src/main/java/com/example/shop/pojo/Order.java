package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

/**
 * order
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private String orderId;
    private String userId;
    private String orderStatus;
    private String orderTime;
    private Double oriAmount;
    private Double realAmount;
    private String addressId;
    private Integer deliveryId;
    private Integer usePoint;
}