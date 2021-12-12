package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/12/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AComplexOrder {
    private  int Total;
    private  List<ComplexOrder> complexOrders;
}
