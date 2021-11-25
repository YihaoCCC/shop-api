package com.example.shop.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * goods_version
 *
 * @author
 */
@Data
public class GoodsVersion implements Serializable {
    private static final long serialVersionUID = 1L;
    private String goodsVersionId;
    private String goodsId;
    private String goodsVersionDetail;
    private Double goodsPrice;
    private Integer versionInvn;
    private String versionPhotoUrl;
}