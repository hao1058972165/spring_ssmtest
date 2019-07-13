package com.itqf.controller;

import com.itqf.pojo.Leave;
import com.itqf.pojo.User;
import com.itqf.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @autor hhh
 * @create 2019/7/10
 */
@Controller
public class LeaveController {
    @Autowired
    private LeaveService leaveService;

    @RequestMapping("/leave")
    public String leave(){
        return  "leave";
    }
    @RequestMapping("/addLeave")
    public String addLeave(Leave leave, HttpSession session){
        System.out.println("hahhah");
        User user = (User) session.getAttribute("user");
        leave.setUser(user);
        leaveService.addLeave(leave);
        return  "redirect:show";
    }
    @RequestMapping("/leaveList")
    public String leavelist(Model model, HttpSession session){
        User user = (User) session.getAttribute("user");
        String username = user.getUsername();
        List<Leave> leaveList = leaveService.leaveList(username);
        model.addAttribute("leaveList",leaveList);
        return  "leave_list";
    }
    @RequestMapping("/updateList")
    @ResponseBody
    public String update(int lid){
        leaveService.updateLeave(lid);
        return "success";

    }
}
