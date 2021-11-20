package com.example.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * station_message
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationMessage implements Serializable {
    private String messageId;

    private String messageContent;

    private static final long serialVersionUID = 1L;
}