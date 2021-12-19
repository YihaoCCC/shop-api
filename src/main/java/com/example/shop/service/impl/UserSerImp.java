package com.example.shop.service.impl;

import com.example.shop.mapper.UserDao;
import com.example.shop.pojo.User;
import com.example.shop.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserSerImp implements UserSer {
    @Autowired(required = false)
    private UserDao userDao;



    @Override
    public int deleteByPrimaryKey(String userId) {
        return userDao.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public User login(String phone, String pswd) {
        return userDao.login(phone, pswd);
    }

    @Override
    public String check(String phone) {
        return userDao.check(phone);
    }

    @Override
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int updatePointByKey(String userId, int point) {
        return userDao.updatePointByKey(userId,point);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }


    @Override
    public int updatePswdByKey(String userId, String pswd) {
        return userDao.updatePswdByKey(userId, pswd);
    }

    @Override
    public int updateNameByKey(String userId, String userName) {
        return userDao.updateNameByKey(userId, userName);
    }

    @Override
    public List<User> queryAll(int pageNum) {
        int pageSize = 8;
        int start = (pageNum - 1) * pageSize;
        return userDao.queryAll(start, pageSize);
    }
}
