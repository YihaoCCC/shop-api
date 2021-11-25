package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private String userId;
    private List<CartList> goodsList;

}
