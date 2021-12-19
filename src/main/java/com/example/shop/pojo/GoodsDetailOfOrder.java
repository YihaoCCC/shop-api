package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDetailOfOrder {

    private String goodsName;
    private String userId;
    private String goodsVersionId;
}
