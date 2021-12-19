package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetReqBody {
    private String userId;
    private String usePoint;
    private String addressId;

}
