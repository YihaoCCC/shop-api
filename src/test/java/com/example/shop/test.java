package com.example.shop;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/12/2
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(14);
        list.add(9);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1- o2 < 0) {
                    return 1;
                } else if (o1 - o2 == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

}
