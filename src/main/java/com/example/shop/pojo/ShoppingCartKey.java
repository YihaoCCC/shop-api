package com.example.shop.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * shopping_cart
 * @author 
 */
@Data
public class ShoppingCartKey implements Serializable {
    private String userId;

    private String goodsId;

    private String goodsVersionId;

    private static final long serialVersionUID = 1L;
}