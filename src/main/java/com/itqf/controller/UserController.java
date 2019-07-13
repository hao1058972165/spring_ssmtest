package com.itqf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itqf.pojo.Profile;
import com.itqf.pojo.User;
import com.itqf.service.UserService;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * author: 赵伟风
 * date: 2019/6/28 12:12
 * description:
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private SecurityManager securityManager;
//    @Autowired
//    private UserService userService;

    @RequestMapping("display")
    public String display() {
        return "display";
    }

    @RequestMapping("register")
    public String register() {
        return "register";
    }

//    @RequestMapping("login")
//    public String login(String username, String password,HttpSession session) {
////        ModelAndView modelAndView = new ModelAndView();
//        if (userService.login(username, password) != null) {
////            List<Profile> profiles = userService.show();
////            PageInfo pageInfo = new PageInfo(profiles);
////            List page = pageInfo.getList();
////           从第几页开始，每次几页
////            modelAndView.setViewName("show");
////            modelAndView.addObject("user",userService.login(username,password));
////            modelAndView.addObject("show",profiles);
////            modelAndView.addObject("page",pageInfo);
//            session.setAttribute("user",userService.login(username,password));
//            return "forward:page";
//        }else {
//            return "display";
//        }
//    }
@RequestMapping(value = "login",method = RequestMethod.POST)
public String login(User user,HttpSession session){
    SecurityUtils.setSecurityManager(securityManager);
    Subject subject = SecurityUtils.getSubject();
    UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUsername(),user.getPassword());
    try{
        subject.login(usernamePasswordToken);
        if(subject.isAuthenticated()){
            session.setAttribute("user",user);
            return "redirect:show";
        }
    }catch (AuthenticationException e){
        System.out.println("登录失败");
    }

    return "display";

}
//        } else {
//            modelAndView.setViewName("display");
//            return modelAndView;
//        }
//    }
    @RequestMapping("page")
    public String page(String currentpage){
        if(currentpage==null){
            PageHelper.startPage(1,2);
        }else {
            PageHelper.startPage(Integer.parseInt(currentpage), 2);
        }
        return "forward:show";
    }
    @RequestMapping("show")
    public ModelAndView show(HttpSession session) {
        User user = (User) session.getAttribute("user");
        int uid = user.getUid();
        ModelAndView modelAndView = new ModelAndView();
            List<Profile> profiles = userService.show1(uid);
        System.out.println("profiles = " + profiles);
            PageInfo pageInfo = new PageInfo(profiles);
//          List page = pageInfo.getList();
            modelAndView.setViewName("show");
            modelAndView.addObject("show",profiles);
            modelAndView.addObject("page",pageInfo);
            return modelAndView;
        }
    @RequestMapping("detail")
    public ModelAndView detail(int id){
        ModelAndView modelAndView = new ModelAndView();
        Profile detail = userService.detail(id);
        modelAndView.setViewName("detail");
        modelAndView.addObject("detail",detail);
        return modelAndView;
    }
    @RequestMapping("modify")
    public String modify(Profile profile, MultipartFile file, HttpServletRequest servletRequest) throws IOException {
        System.out.println(profile);
        String originalFilename = file.getOriginalFilename();
        String path = servletRequest.getServletContext().getRealPath("/public");
        if (!file.isEmpty())
        {
            file.transferTo(new File(path+"//"+originalFilename));
        }
        String picture = "public/"+originalFilename;
        profile.setPicture(picture);
        userService.modify(profile);
        return "redirect:/page";
    }
    @RequestMapping("premodify")
    public ModelAndView premodify(int id){
        ModelAndView modelAndView = new ModelAndView();
        Profile detail = userService.detail(id);
        modelAndView.setViewName("modify");
        modelAndView.addObject("detail",detail);
        return modelAndView;
    }
    @RequestMapping("register1")
    public String register(User user){
        userService.register(user);
        return "forward:/display";
    }
    @RequestMapping("/upload")
    @ResponseBody
    public  String saveFile(@RequestParam("name") String name , @RequestParam("file") MultipartFile file) throws IOException {
        //接收表单提交的数据,包含文件
        System.out.println("name = " + name);
        if (!file.isEmpty())
        {
            file.transferTo(new File("D:/Temp/"+file.getOriginalFilename()));
        }
        return "success";
    }
    @RequestMapping(value = "delete/{id}",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String deleteProfile(@PathVariable("id") int id){
        userService.delete(id);
        JSONObject json = new JSONObject();
        json.element("resp","删除成功");
        return json.toString();
    }
    @RequestMapping("unauthorize")
    public String unauthrized(){
        return "unauthorize";
    }

}
