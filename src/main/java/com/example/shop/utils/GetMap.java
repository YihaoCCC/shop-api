package com.example.shop.utils;

import com.example.shop.pojo.CartList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class GetMap {
    public static HashMap<String, List<CartList>> getMap(List<CartList> list) {
        list = list.stream().filter(cartList -> cartList.getIsChose() == 1).collect(Collectors.toList());
        HashMap<String, List<CartList>> hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<CartList> cartLists = new ArrayList<>();
            String key = list.get(i).getPromotionDetail();
            if (hashMap.containsKey(key)) {
                cartLists.addAll(hashMap.get(key));
            }
            cartLists.add(list.get(i));
            hashMap.put(key, cartLists);
        }
        return hashMap;
    }
}
