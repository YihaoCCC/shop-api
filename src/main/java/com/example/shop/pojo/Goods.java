package com.example.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * goods
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements Serializable {
    private String goodsId;

    private String goodsName;

    private String goodsDetail;

    private Integer goodsKindId;

    private String goodsStatus;

    private Integer goodsInvn;

    private Double goodsPrice;

    private String photoUrl;

    private static final long serialVersionUID = 1L;
}