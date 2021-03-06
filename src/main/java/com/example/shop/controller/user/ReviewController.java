package com.example.shop.controller.user;

import com.example.shop.pojo.ComplexOrder;
import com.example.shop.pojo.Review;
import com.example.shop.service.ReviewSer;
import com.example.shop.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ReviewController {
    @Autowired
    private ReviewSer reviewSer;

    /**
     * 添加评论
     */
    @PostMapping("/review/add")
    public int insertReview(@RequestBody Review review){
        review.setReviewTime(DateUtils.getNowDate());
        return reviewSer.insert(review);
    }
}
