package com.itqf.mapper;


import com.itqf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * author: 赵伟风
 * date: 2019/6/27 9:33
 * description:
 */

public interface UserMapper {
    User queryUser(@Param("username") String username,@Param("password") String password);
    int insertUser(User user);
    String getUsername(String username);
    String getPassword(String username);
}
