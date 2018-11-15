package com.gsww.service;

import com.gsww.entity.User;

import java.util.List;

public interface UserService {

   User findUserByExample(User user);
   List<User> findAll();
   void saveUser(User user);
}