package com.example.shop.utils;

import java.util.Comparator;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/12/6
 */
public class MyComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 - o2 > 0) {
            return 1;
        } else if (o1 - o2 == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
