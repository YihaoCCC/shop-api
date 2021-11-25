package com.example.shop.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/22
 */
@Data
public class GoodsDetailReview {
    private static final long serialVersionUID = 1L;

    private String goodsId;

    private String goodsName;

    private Integer goodsKindId;

    private Integer goodsIsSelf;

    private String goodsDetail;

    private String goodsStatus;

    private Integer goodsInvn;

    private Double goodsPrice;

    private String photoUrl;

    private String promotionDetail;

    private List<GoodsVersion> goodsVersions;

    private List<Review> reviews;
    //特殊需要
    private String GoodsVersionDetail;
}
