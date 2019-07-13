package com.itqf.service;

import com.itqf.pojo.Leave;

import java.util.List;

/**
 * @autor hhh
 * @create 2019/7/10
 */
public interface LeaveService {
    public int addLeave(Leave leave);
//    老师登录获取需要审批的请假条列表
    public List<Leave> leaveList(String username);
//    改变请假条状态
    public int updateLeave(int lid);
}
