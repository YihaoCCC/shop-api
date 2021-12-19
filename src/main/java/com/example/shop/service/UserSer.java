package com.example.shop.service;

import com.example.shop.pojo.User;

import java.util.List;


public interface UserSer {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    User login(String phone, String pswd);

    String check(String phone);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updatePointByKey(String userId,int point);

    int updateByPrimaryKeySelective(User record);

    int updatePswdByKey(String userId,String pswd);

    int updateNameByKey(String userId,String userName);

    List<User> queryAll(int pageNum);
}
