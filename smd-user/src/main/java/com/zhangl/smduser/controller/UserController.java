package com.zhangl.smduser.controller;

import com.zhangl.smduser.dto.OrderDto;
import com.zhangl.smduser.service.UserRemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRemoteService userRemoteService;

    @RequestMapping("getOrder")
    public OrderDto getOrder(@RequestParam Integer userId) {

        return userRemoteService.getOrderByUserId(userId);
    }
}
