package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * address
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    private String addressId;
    private String userId;
    private String name;
    private String phone;
    private String province;
    private String city;
    private String area;
    private String addressDetail;
    private int isDefault;
}