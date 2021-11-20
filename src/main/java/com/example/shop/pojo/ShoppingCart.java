package com.example.shop.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * shopping_cart
 * @author 
 */
@Data

public class ShoppingCart extends ShoppingCartKey implements Serializable {
    private Double goodsPrice;

    private Integer goodsNumber;

    private static final long serialVersionUID = 1L;
}