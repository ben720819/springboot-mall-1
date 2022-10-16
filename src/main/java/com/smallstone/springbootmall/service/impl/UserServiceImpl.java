package com.smallstone.springbootmall.service.impl;

import com.smallstone.springbootmall.dao.UserDao;
import com.smallstone.springbootmall.dto.UserRegisterRequest;
import com.smallstone.springbootmall.model.User;
import com.smallstone.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
