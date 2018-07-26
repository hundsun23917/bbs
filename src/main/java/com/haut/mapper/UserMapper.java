package com.haut.mapper;

import com.haut.bean.User;

public interface UserMapper {
    User selectUserById(int id);
}
