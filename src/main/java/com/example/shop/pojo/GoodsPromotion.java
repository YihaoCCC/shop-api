package com.example.shop.pojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * goods_promotion
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsPromotion implements Serializable {
    private String goodsId;

    private String promotionKind;

    private String promotionDetail;

    private Integer promotionFull;

    private Integer promotionSub;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startTime;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date endTime;

    private static final long serialVersionUID = 1L;
}