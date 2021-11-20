package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * goods_kind
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsKind implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer kindId;

    private String kindName;
}