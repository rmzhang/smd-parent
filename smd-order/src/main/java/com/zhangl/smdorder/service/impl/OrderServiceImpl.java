package com.zhangl.smdorder.service.impl;

import com.zhangl.smdorder.dao.OrderDao;
import com.zhangl.smdorder.model.Order;
import com.zhangl.smdorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order getOrder(String orderNo) {
        return orderDao.getOrderByNo(orderNo);
    }

    @Override
    public Order getOrderByUserId(Integer userId) {
        return orderDao.getOrderByUserId(userId);
    }
}
