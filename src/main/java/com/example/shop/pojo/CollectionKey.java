package com.example.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * collection
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectionKey implements Serializable {
    private String userId;

    private String goodsId;

    private static final long serialVersionUID = 1L;
}