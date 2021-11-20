package com.example.shop.service.impl;

import com.example.shop.mapper.AddressDao;
import com.example.shop.pojo.Address;
import com.example.shop.service.AddressSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class AddressSerImp implements AddressSer {
    @Autowired(required = false)
    private AddressDao addressDao;

    @Override
    public int deleteByPrimaryKey(String addressId) {
        return addressDao.deleteByPrimaryKey(addressId);
    }

    @Override
    public int insert(Address record) {
        return addressDao.insert(record);
    }

    @Override
    public int insertSelective(Address record) {
        return addressDao.insertSelective(record);
    }

    @Override
    public Address selectByPrimaryKey(String addressId) {
        return addressDao.selectByPrimaryKey(addressId);
    }

    @Override
    public int updateByPrimaryKeySelective(Address record) {
        return addressDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Address record) {
        return addressDao.updateByPrimaryKey(record);
    }
}
