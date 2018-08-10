package com.zhangl.smdorder.controller;

import com.zhangl.smdorder.model.Order;
import com.zhangl.smdorder.service.OrderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("getOrder")
    public Order getOrder(String orderNo) {
        if (StringUtils.isNotBlank(orderNo)) {
            return orderService.getOrder(orderNo);
        }
        return null;
    }

    @RequestMapping("getOrderByUserId")
    public Order getOrderByUserId(@RequestParam Integer userId) {
        if (userId != null) {
            return orderService.getOrderByUserId(userId);
        }
        return null;
    }
}
