package com.haut.mapper;

import com.haut.bean.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {
    User selectUserById(int id);
}
