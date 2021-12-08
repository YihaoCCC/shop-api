package com.example.shop.service.impl;

import com.example.shop.mapper.*;
import com.example.shop.pojo.*;
import com.example.shop.service.OrderSer;
import com.example.shop.service.ShoppingCartSer;
import com.example.shop.service.UserSer;
import com.example.shop.utils.DateUtils;
import com.example.shop.utils.GetMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author 苏聪杰
 * @Description
 * @date 2021/11/19
 */
@Service
public class OrderSerImp implements OrderSer {
    @Autowired(required = false)
    private OrderDao orderDao;
    @Autowired
    private ShoppingCartSer shoppingCartSer;
    @Autowired
    private UserSer userSer;
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private GoodsVersionDao goodsVersionDao;
    @Autowired
    private GoodsPromotionDao goodsPromotionDao;
    @Autowired
    private OrderDetailDao orderDetailDao;
    @Autowired
    private AddressDao addressDao;

    @Override
    public int deleteByPrimaryKey(String orderId) {
        return orderDao.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insertSelective(Order record) {
        return orderDao.insertSelective(record);
    }

    @Override
    public Order selectByPrimaryKey(String orderId) {
        return orderDao.selectByPrimaryKey(orderId);
    }

    @Override
    public ComplexOrder setOrder(GetReqBody body) {
        Cart cart = shoppingCartSer.computeTotal(shoppingCartSer.queryByUserId(body.getUserId()));
        User user = userSer.selectByPrimaryKey(body.getUserId());
        Order order = new Order();
        if ("1".equals(body.getUsePoint())) {
            //实际支付金额
            double realMoney = cart.getTotal() - cart.getOriTotal() * 0.03;
            user.setPoints((int) (user.getPoints() - 3 * cart.getOriTotal()));
            order.setRealAmount(realMoney);
            order.setUsePoint(1);
            userSer.updatePointByKey(body.getUserId(), user.getPoints());
        } else {
            order.setRealAmount(cart.getTotal());
            order.setUsePoint(0);

        }
        order.setUserId(body.getUserId());
        order.setOrderStatus("待付款");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        order.setOrderTime(DateUtils.getNowDate());
        order.setOriAmount(cart.getOriTotal());
        order.setAddressId(body.getAddressId());
        order.setDeliveryId(1);
        String orderId = UUID.randomUUID().toString().replace("-", "");
        order.setOrderId(orderId);
        //将生成的订单入库；
        orderDao.insert(order);
        //详细订单
        HashMap<String, List<CartList>> hashMap = GetMap.getMap(cart.getGoodsList());
        for (Map.Entry<String, List<CartList>> entry : hashMap.entrySet()) {
            double sum = 0;
            double promotion = 0;
            List<CartList> cartLists = entry.getValue();
            for (CartList cartList : cartLists) {
                sum += cartList.getPrice();
            }
            if (entry.getKey() != null) {
                GoodsPromotion goodsPromotion = goodsPromotionDao.selectByPrimaryKey(cartLists.get(0).getGoodsId());
                promotion = ((int) (sum / goodsPromotion.getPromotionFull())) * goodsPromotion.getPromotionSub();
            }
            for (CartList cartList : cartLists) {
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setGoodsId(cartList.getGoodsId());
                orderDetail.setOrderId(orderId);
                orderDetail.setGoodsVersionId(cartList.getGoodsVersionId());
                orderDetail.setNumber(cartList.getNum());
                orderDetail.setOriPrice(cartList.getPrice());
                double realPrice = cartList.getPrice() - ((cartList.getPrice() / sum) * promotion);
                orderDetail.setRealPrice(realPrice);
                orderDetailDao.insert(orderDetail);
            }

        }
        //删除支付完成的购物车的商品
        shoppingCartSer.deleteByUserId(user.getUserId());
        return orderDao.queryByOrderId(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return orderDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return orderDao.updateByPrimaryKey(record);
    }

    public ComplexOrder extractCode(ComplexOrder complexOrder) {
        complexOrder.setAddress(addressDao.selectByPrimaryKey(complexOrder.getAddressId()));
        for (OrderDetail orderDetail : complexOrder.getOrderDetails()) {
            orderDetail.setGoodsName(goodsDao.getGoodsByGoodsId(orderDetail.getGoodsId()).getGoodsName());
            orderDetail.setGoodsVersionDetail(goodsVersionDao.selectByVersionId(orderDetail.getGoodsVersionId()).getGoodsVersionDetail());
            orderDetail.setVersionPhotoUrl(goodsVersionDao.selectByVersionId(orderDetail.getGoodsVersionId()).getVersionPhotoUrl());
        }
        return complexOrder;
    }

    @Override
    public ComplexOrder queryByOrderId(String orderId) {
        ComplexOrder complexOrder = orderDao.queryByOrderId(orderId);
        return extractCode(complexOrder);
    }

    @Override
    public int updateByOrderId(String orderId, String status) {
        return orderDao.updateByOrderId(orderId,status);
    }

    @Override
    public int CountOrderNumber() {
        return orderDao.CountOrderNumber();
    }

    @Override
    public List<ComplexOrder> queryAllByUserId(String userId, int pageNum, String status) {
        if ("全部".equals(status)) {
            status = null;
        } else if ("已完成".equals(status)) {
            status = "待评价";
        }
        int pageSize = 3;
        int start = (pageNum - 1) * pageSize;
        List<ComplexOrder> complexOrders = orderDao.queryAllByUserId(userId, start, pageSize, status);
        for (ComplexOrder complexOrder : complexOrders) {
            extractCode(complexOrder);
        }
        return complexOrders;
    }

    @Override
    public AComplexOrder queryAll(int pageNum) {
        int pageSize = 8;
        int start = (pageNum - 1) * pageSize;
        List<ComplexOrder> complexOrders = orderDao.queryAll(start, pageSize);
        for (ComplexOrder complexOrder : complexOrders) {
            extractCode(complexOrder);
        }
        AComplexOrder aComplexOrder = new AComplexOrder();
        aComplexOrder.setTotal(orderDao.CountOrderNumber());
        aComplexOrder.setComplexOrders(complexOrders);
        return aComplexOrder;
    }

    @Override
    public int payTheOrder(String orderId) {
        Order order = orderDao.selectByPrimaryKey(orderId);
        order.setOrderStatus("待发货");
        User user = userSer.selectByPrimaryKey(order.getUserId());
        int newPoint = user.getPoints() + (int) (order.getOriAmount() * 0.3);
        userSer.updatePointByKey(order.getUserId(), newPoint);
        return orderDao.updateByPrimaryKey(order);
    }

    @Override
    public int deleteNotPayOrder(String orderId) {
        Order order = orderDao.selectByPrimaryKey(orderId);
        User user = userSer.selectByPrimaryKey(order.getUserId());
        user.setPoints(user.getPoints() + (int) (order.getOriAmount() * 3));
        userSer.updatePointByKey(user.getUserId(), user.getPoints());
        return orderDao.deleteNotPayOrder(orderId);
    }
}
