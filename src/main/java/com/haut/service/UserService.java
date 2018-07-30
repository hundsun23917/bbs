package com.haut.service;

import com.haut.bean.User;

import java.util.List;


public interface UserService{
    User getUserById(int id);

    List<User> getAllUsers();
    List<User> getUsersList(int page,int rows);
}
