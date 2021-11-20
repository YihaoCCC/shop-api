package com.example.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * delivery
 * @author 
 */
@Data
@AllArgsConstructor
public class Delivery implements Serializable {
    private Integer deliveryId;

    private String deliveryName;

    private static final long serialVersionUID = 1L;
}