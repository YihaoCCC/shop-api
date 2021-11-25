package com.example.shop.mapper;

import com.example.shop.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    User login(String phone, String pswd);

    String check(@Param(value = "phone") String phone);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}