package com.example.shop.controller.user;

import com.example.shop.pojo.CollectionKey;
import com.example.shop.pojo.Goods;
import com.example.shop.service.CollectionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CollectionController {
    @Autowired
    private CollectionSer collectionSer;

    /**
     * 加入收藏夹
     * @param collection
     * @return 1添加成功，0商品已添加
     */
    @PostMapping("/collection/add")
    public int insertCollection(@RequestBody CollectionKey collection){
        CollectionKey res = collectionSer.query(collection);
        if(res == null){
            return collectionSer.insert(collection);
        }else {
            return 0;
        }
    }

    /**
     * 查看收藏夹
     * @param userId
     * @param pageNum
     * @return
     */
    @GetMapping("/collection/queryByUserId/{userId}&{pageNum}")
    public List<Goods> queryByUserId(@PathVariable String userId, @PathVariable int pageNum){
        return collectionSer.queryByUserId(userId,pageNum);
    }

    /**
     * 在收藏夹中删除商品
     * @param collection
     * @return 1成功
     */
    @PostMapping("/collection/delete")
    public int delete(@RequestBody CollectionKey collection){
        return collectionSer.deleteByPrimaryKey(collection);
    }
}
