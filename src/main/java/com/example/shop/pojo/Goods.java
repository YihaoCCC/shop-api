package com.example.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * goods
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;

    private String goodsId;

    private String goodsName;

    private Integer goodsKindId;

    private Integer goodsIsSelf;

    private String goodsDetail;

    private String goodsStatus;

    private Integer goodsInvn;

    private Double goodsPrice;

    private String photoUrl;

}