package com.example.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * order_detail
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailKey implements Serializable {
    private String orderId;

    private String goodsId;

    private static final long serialVersionUID = 1L;
}