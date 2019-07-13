package com.itqf.pojo;

import java.sql.Date;

/**
 * @autor hhh
 * @create 2019/7/10
 */
public class Leave {
    private int lid;
    private User user;
    private Date startdate;
    private Date enddate;
    private String reason;
    private int state;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "lid=" + lid +
                ", user=" + user +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", reason='" + reason + '\'' +
                ", state=" + state +
                '}';
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
