package com.example.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * goods_kind
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsKind implements Serializable {
    private Integer kindId;

    private String kindName;

    private static final long serialVersionUID = 1L;
}