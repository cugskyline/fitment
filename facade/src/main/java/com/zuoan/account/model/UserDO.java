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
}
