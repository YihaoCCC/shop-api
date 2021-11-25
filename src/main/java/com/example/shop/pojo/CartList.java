package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartList {
    private String goodsId;
    private String goodsName;
    private String goodsVersionId;
    private String goodsVersionDetail;
    private String versionPhotoUrl;
    private Double price;
    private String promotionDetail;
    private int versionInvn;
    private int isChose;
    private int num;

}
