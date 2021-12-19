package com.example.shop.service.impl;

import com.example.shop.mapper.AddressDao;
import com.example.shop.pojo.Address;
import com.example.shop.service.AddressSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressSerImp implements AddressSer {
    @Autowired(required = false)
    private AddressDao addressDao;

    @Override
    public int deleteByPrimaryKey(String addressId) {
        return addressDao.deleteByPrimaryKey(addressId);
    }

    @Override
    public int insert(Address address) {
        if(address.getIsDefault() == 1){
            addressDao.updateIsDefault(address.getUserId());
        }
        return addressDao.insert(address);
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
    public int updateByPrimaryKey(Address address) {
        if(address.getIsDefault() == 1){
            addressDao.updateIsDefault(address.getUserId());
        }
        return addressDao.updateByPrimaryKey(address);
    }

    @Override
    public List<Address> queryByUserId(String userId) {
        return addressDao.queryByUserId(userId);
    }

}
