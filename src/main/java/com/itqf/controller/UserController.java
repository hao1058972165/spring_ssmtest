package com.itqf.controller;

import com.github.pagehelper.PageHelper;
import com.itqf.pojo.User;
import com.itqf.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    @ResponseBody
public String login(User user){
        String password = user.getPassword();
        String p1=userService.getPassword(user.getUsername());
        if(password.equals(p1)){
            return "hhhh";
        }
        return "dd";
    }
    @RequestMapping("display")
    public String display() {
        return "display";
    }

  
}
