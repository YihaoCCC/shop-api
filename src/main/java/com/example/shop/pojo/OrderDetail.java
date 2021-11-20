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
public class OrderDetail extends OrderDetailKey implements Serializable {
    private Integer number;

    private Double oriPrice;

    private Double realPrice;

    private static final long serialVersionUID = 1L;
}