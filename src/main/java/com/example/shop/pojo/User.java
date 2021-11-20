package com.example.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * user
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String userId;

    private String userName;

    private String sex;

    private Integer phone;

    private String pswd;

    private String role;

    private Integer points;

    private static final long serialVersionUID = 1L;
}