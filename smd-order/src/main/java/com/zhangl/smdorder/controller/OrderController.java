package com.zhangl.smdorder.controller;

import com.zhangl.smdorder.model.Order;
import com.zhangl.smdorder.service.OrderService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smd-order/")
public class OrderController {

    private final static Logger logger = LoggerFactory.getLogger(OrderController.class);

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
            logger.info("userId=" + userId);
            return orderService.getOrderByUserId(userId);
        }
        return null;
    }
}
