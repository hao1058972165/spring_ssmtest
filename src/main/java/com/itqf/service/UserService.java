package com.itqf.service;

import com.itqf.pojo.Profile;
import com.itqf.pojo.User;

import java.util.Date;
import java.util.List;

public interface UserService {
    User login(String username,String password);
    List<Profile> show();
    Profile detail(int id);
    int modify(Profile profile);
    int register(User user);
    int delete(int id);
    List<Profile> show1(int uid);
    String getPassword(String username);
}
