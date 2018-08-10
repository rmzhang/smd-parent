package com.zhangl.smduser.service.impl;

import com.zhangl.smduser.dao.UserDao;
import com.zhangl.smduser.dto.OrderDto;
import com.zhangl.smduser.model.User;
import com.zhangl.smduser.service.UserRemoteService;
import com.zhangl.smduser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService ,UserRemoteService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public OrderDto getOrderByUserId(Integer userId) {
        return null;
    }
}
