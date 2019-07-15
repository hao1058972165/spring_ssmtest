package com.itqf.service;


public interface UserService {
    String getPassword(String username);
    int  getUid(String username);
    String getStatus(String username);
}
