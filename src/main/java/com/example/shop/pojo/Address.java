package com.example.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * address
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {
    private String addressId;

    private String userId;

    private String name;

    private Integer phone;

    private String address;

    private static final long serialVersionUID = 1L;
}