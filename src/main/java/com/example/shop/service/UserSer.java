package com.example.shop.service;

import com.example.shop.pojo.User;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface UserSer {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    User login(String phone, String pswd);

    String check(String phone);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
