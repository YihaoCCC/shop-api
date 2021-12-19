package com.example.shop.controller.user;

import com.example.shop.pojo.StationMessage;
import com.example.shop.service.StationMessageSer;
import com.example.shop.service.impl.StationMessageSerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StationMessageCon {
    @Autowired
    private StationMessageSer stationMessageSer;
    @GetMapping("/station/message")
    private List<StationMessage> queryAll(){
        return stationMessageSer.queryAll();
    }
}
