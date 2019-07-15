package com.itqf.mapper;

import com.itqf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    User queryUser(@Param("username") String username,@Param("password") String password);
    int insertUser(User user);
    int getUid(String username);
    String getUsername(String username);
    String getPassword(String username);
    String getStatus(String username);

}
