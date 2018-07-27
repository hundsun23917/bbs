package com.haut.serviceImpl;

import com.haut.bean.User;
import com.haut.mapper.UserMapper;
import com.haut.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper ;
    @Override
    public User getUserById(int id) {
        User user = userMapper.selectUserById(id);
        return user;
    }
}
