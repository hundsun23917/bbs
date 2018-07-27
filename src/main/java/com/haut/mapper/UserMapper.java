package com.haut.mapper;

import com.haut.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUserById(int id);
}
