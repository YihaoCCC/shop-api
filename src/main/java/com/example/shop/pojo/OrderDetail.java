package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * order_detail
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail extends OrderDetailKey implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer number;
    private Double oriPrice;
    private Double realPrice;

    private String goodsName;

    private String goodsVersionDetail;

    private String versionPhotoUrl;
}