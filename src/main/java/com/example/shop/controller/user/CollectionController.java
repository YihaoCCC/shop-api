package com.example.shop.controller.user;

import com.example.shop.pojo.Collect;
import com.example.shop.pojo.CollectionKey;
import com.example.shop.pojo.Goods;
import com.example.shop.service.CollectionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/25
 */
@RestController
public class CollectionController {
    @Autowired
    private CollectionSer collectionSer;

    /**
     * 加入收藏夹
     * @param collection
     * @return
     */
    @PostMapping("/collection/add")
    public int insertCollection(@RequestBody CollectionKey collection){
        return collectionSer.insert(collection);
    }

    /**
     * 查看收藏夹
     * @param userId
     * @return
     */
    @GetMapping("/collection/queryByUserId/{userId}")
    public Collect queryByUserId(@PathVariable String userId){
        return collectionSer.queryByUserId(userId);
    }
}
