package com.haut.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.haut.bean.User;
import com.haut.mapper.UserMapper;
import com.haut.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper ;
    @Override
    public User getUserById(int id) {
        User user = userMapper.selectUserById(id);
        return user;
    }

    @Override
    public List<User> getAllUsers() {

        return userMapper.selectAll();
    }
    @Override
    public List<User> getUsersList(int page,int rows){
        PageHelper.startPage(page,rows);
        return userMapper.selectAll();
    }

}
