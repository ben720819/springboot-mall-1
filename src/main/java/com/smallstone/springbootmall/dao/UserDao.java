package com.smallstone.springbootmall.dao;

import com.smallstone.springbootmall.dto.UserRegisterRequest;
import com.smallstone.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserByEmail(String Email);
}
