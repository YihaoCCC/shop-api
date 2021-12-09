package com.example.shop.controller.user;

import com.example.shop.pojo.User;
import com.example.shop.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/22
 */
@RestController
public class UserController {
    @Autowired
    private UserSer userSer;

    /**
     * 登录
     *
     * @param phone
     * @param pswd
     * @return
     */
    @GetMapping("/user/login/{phone}&{pswd}")
    private User login(@PathVariable(value = "phone") String phone, @PathVariable(value = "pswd") String pswd) {
        return userSer.login(phone, pswd);
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @PostMapping("/user/register")
    private int register(@RequestBody User user) {
        if (userSer.check(user.getPhone()) == null) {
            userSer.insert(user);
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 按userId查询用户
     *
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}")
    public User queryByUserId(@PathVariable String userId) {
        return userSer.selectByPrimaryKey(userId);
    }

    @GetMapping("/user/modifyPassword/{userId}&{newPswd}")
    private int modifyPswd(@PathVariable String userId, @PathVariable String newPswd) {
        return userSer.updatePswdByKey(userId, newPswd);
    }

    @GetMapping("/user/modifyName/{userId}&{name}")
    private int modifyName(@PathVariable String userId, @PathVariable String name) {
        return userSer.updateNameByKey(userId, name);
    }

}
