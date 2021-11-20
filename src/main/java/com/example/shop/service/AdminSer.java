package com.example.shop.service;

import com.example.shop.pojo.Admin;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
public interface AdminSer {
    int deleteByPrimaryKey(String adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
