package com.example.shop.controller.user;

import com.example.shop.pojo.Review;
import com.example.shop.service.ReviewSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/22
 */
@RestController
public class ReviewController {
    @Autowired
    private ReviewSer reviewSer;

    /**
     * 添加评论
     */
    @PostMapping("/review/add")
    public int insertReview(@RequestBody Review review){
        return reviewSer.insert(review);
    }
}
