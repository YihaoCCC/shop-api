package com.example.shop.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.shop.pojo.User;
import com.example.shop.service.UserSer;

import java.util.List;


@RestController
public class AUserController {
    @Autowired
    private UserSer userSer;
    @GetMapping("/admin/user/queryAll/{pageNum}")
    public List<User> queryAll(@PathVariable int pageNum){
        return userSer.queryAll(pageNum);
    }
}
