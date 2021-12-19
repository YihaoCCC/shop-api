package com.example.shop.controller.admin;

import com.example.shop.mapper.GoodsKindDao;
import com.example.shop.pojo.GoodsKind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AGoodsKindCOnt {
    @Autowired
    private GoodsKindDao kindDao;

    @GetMapping("/admin/getKind")
    private List<GoodsKind> getAllKind() {
        return kindDao.queryAll();
    }
}
