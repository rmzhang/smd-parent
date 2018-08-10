package com.zhangl.smdorder.service;

import com.zhangl.smdorder.model.Order;

public interface OrderService {

    Order getOrder(String orderNo);

    Order getOrderByUserId(Integer userId);
}
