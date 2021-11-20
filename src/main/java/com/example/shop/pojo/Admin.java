package com.example.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * admin
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    private String adminId;

    private String adminName;

    private String phone;

    private String pswd;

    private static final long serialVersionUID = 1L;
}