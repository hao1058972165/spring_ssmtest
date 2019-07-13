package com.itqf.service;

import com.itqf.mapper.ProfileMapper;
import com.itqf.mapper.UserMapper;
import com.itqf.pojo.Profile;
import com.itqf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProfileMapper profileMapper;
    public User login(String username, String password) {
        User user = userMapper.queryUser(username,password);
        if(user!=null&&user.getUsername().equals(username)&&user.getPassword().equals(password)){
            return user;
        }else{
            return null;
        }
    }
    public List<Profile> show(){
        List list = profileMapper.queryProfile();
        return list;
    }

    public Profile detail(int id) {
        return profileMapper.querySimple(id);
    }

    public int modify(Profile profile) {
        int i = profileMapper.updateProfile(profile);
        return i;
    }

    public int register(User user) {
        int i = userMapper.insertUser(user);
        return i;
    }

    public int delete(int id) {
      return  profileMapper.deleteProfile(id);
    }

    public List<Profile> show1(int uid) {
        return profileMapper.queryProfile2( uid);
    }

    public String getPassword(String username) {
        return userMapper.getPassword(username);
    }
}
