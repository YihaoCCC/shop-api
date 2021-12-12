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
public class GetReqBody {
    private String userId;
    private String usePoint;
    private String addressId;

}
