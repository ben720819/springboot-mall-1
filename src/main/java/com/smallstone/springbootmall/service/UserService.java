package com.smallstone.springbootmall.service;

import com.smallstone.springbootmall.dto.UserRegisterRequest;
import com.smallstone.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
