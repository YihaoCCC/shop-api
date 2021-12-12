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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CartList cartList = (CartList) o;
        return versionInvn == cartList.versionInvn && isChose == cartList.isChose && num == cartList.num && Objects.equals(goodsId, cartList.goodsId) && Objects.equals(goodsName, cartList.goodsName) && Objects.equals(goodsVersionId, cartList.goodsVersionId) && Objects.equals(goodsVersionDetail, cartList.goodsVersionDetail) && Objects.equals(versionPhotoUrl, cartList.versionPhotoUrl) && Objects.equals(price, cartList.price) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId, goodsName, goodsVersionId, goodsVersionDetail, versionPhotoUrl, price, versionInvn, isChose, num);
    }
}
