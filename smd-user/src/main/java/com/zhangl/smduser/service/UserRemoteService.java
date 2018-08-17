package com.zhangl.smduser.service;

import com.zhangl.smduser.dto.OrderDto;
import com.zhangl.smduser.service.impl.UserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "smd-order", fallback = UserServiceImpl.class)
public interface UserRemoteService {

    @RequestMapping(value = "smd-order/getOrderByUserId", method = RequestMethod.GET)
    OrderDto getOrderByUserId(@RequestParam(value = "userId") Integer userId);
}
