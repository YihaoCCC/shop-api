package com.example.shop.service.impl;

import com.example.shop.mapper.UserDao;
import com.example.shop.pojo.User;
import com.example.shop.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
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
        return userDao.login(phone,pswd);
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
    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userDao.updateByPrimaryKey(record);
    }
}
