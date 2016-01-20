package com.zuoan.account.service;

import com.zuoan.account.model.UserDO;

import java.util.List;

/**
 * Created by XUJY on 2016/1/19.
 */
public interface UserService {
    //注册用户
    int addUser(UserDO user);
    //修改用户
    int modifyUser(UserDO user);
    //删除用户
    int removeUser(UserDO user);
    //获取用户
    UserDO getUser(UserDO user);
    //通过userId获取用户
    UserDO getUserByUserId(String userId);
    //分页查询用户
    List<UserDO> queryUsers(UserDO user);
}
