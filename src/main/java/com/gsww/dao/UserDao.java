package com.gsww.dao;

import com.gsww.entity.User;

import java.util.List;

public interface UserDao {

    User queryUserByExample(User user);
    List<User> findAll();
    void saveUser(User user);
}