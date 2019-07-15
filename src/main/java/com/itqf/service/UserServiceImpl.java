package com.itqf.service;

import com.itqf.mapper.UserMapper;
import com.itqf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;


    public int register(User user) {
        int i = userMapper.insertUser(user);
        return i;
    }
    public String getPassword(String username) {
        return userMapper.getPassword(username);
    }

    public int getUid(String username) {
        return userMapper.getUid(username);
    }

    public String getStatus(String username) {
        return  userMapper.getStatus(username);
    }
}
