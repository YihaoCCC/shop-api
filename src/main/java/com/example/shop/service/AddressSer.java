package com.example.shop.service;

import com.example.shop.pojo.Address;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */

public interface AddressSer {
    int deleteByPrimaryKey(String addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(String addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    List<Address> queryByUserId(String userId);
}
