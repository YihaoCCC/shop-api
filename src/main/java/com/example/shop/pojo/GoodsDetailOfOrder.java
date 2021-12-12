package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/12/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDetailOfOrder {

    private String goodsName;
    private String userId;
    private String goodsVersionId;
}
