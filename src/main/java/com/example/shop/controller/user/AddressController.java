package com.example.shop.controller.user;

import com.example.shop.pojo.Address;
import com.example.shop.service.AddressSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AddressController {
    @Autowired
    private AddressSer addressSer;

    /**
     * 查看收货地址
     * @param userId
     * @return
     */
    @GetMapping("/address/queryByUserId/{userId}")
    public List<Address> queryByUserId(@PathVariable String userId){
        return addressSer.queryByUserId(userId);
    }

    /**
     * 添加收货地址
     * @param address
     * @return
     */
    @PostMapping("/address/add")
    public List<Address> add(@RequestBody Address address){
        addressSer.insert(address);
        return addressSer.queryByUserId(address.getUserId());
    }

    /**
     * 删除收货地址
     * @param addressId
     * @return
     */
    @DeleteMapping("/address/delete/{addressId}")
    public List<Address> deleteByAddressId(@PathVariable String addressId){
        Address address = addressSer.selectByPrimaryKey(addressId);
        addressSer.deleteByPrimaryKey(addressId);
        return addressSer.queryByUserId(address.getUserId());
    }

    /**
     * 修改收货地址
     * @param address
     * @return
     */
    @PutMapping("/address/modify")
    public int update(@RequestBody Address address){
        return addressSer.updateByPrimaryKey(address);
    }
}
