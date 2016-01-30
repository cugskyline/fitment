package com.zuoan.account.model;

import java.util.Date;

/**
 * Created by XUJY on 2016/1/19.
 */
public class UserDO extends BaseDO {
    private String userId;      //用户ID
    private String userName;    //用户名称
    private String userPswd;    //用户登录密码
    private Date registerTime;  //注册时间

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPswd() {
        return userPswd;
    }

    public void setUserPswd(String userPswd) {
        this.userPswd = userPswd;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}
