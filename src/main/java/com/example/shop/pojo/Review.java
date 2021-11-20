package com.example.shop.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * review
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review implements Serializable {
    private String reviewId;

    private String userId;

    private String goodsId;

    private Date reviewTime;

    private String reviewMessage;

    private static final long serialVersionUID = 1L;
}