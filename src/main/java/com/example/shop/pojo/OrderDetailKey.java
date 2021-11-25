package com.example.shop.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * order_detail
 * @author 
 */
@Data
public class OrderDetailKey implements Serializable {
    private String orderId;

    private String goodsId;

    private String goodsVersionId;

    private static final long serialVersionUID = 1L;
}