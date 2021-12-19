package com.example.shop.service.impl;

import com.example.shop.mapper.AdminDao;
import com.example.shop.pojo.Admin;
import com.example.shop.service.AdminSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminSerImp implements AdminSer {
    @Autowired(required = false)
    private AdminDao adminDao;

    @Override
    public int deleteByPrimaryKey(String adminId) {
        return adminDao.deleteByPrimaryKey(adminId);
    }

    @Override
    public int insert(Admin record) {
        return adminDao.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return adminDao.insertSelective(record);
    }

    @Override
    public Admin selectByPrimaryKey(String adminId) {
        return adminDao.selectByPrimaryKey(adminId);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return adminDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminDao.updateByPrimaryKey(record);
    }
}
