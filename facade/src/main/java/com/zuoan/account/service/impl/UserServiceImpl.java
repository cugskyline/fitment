package com.zuoan.account.service.impl;

import com.zuoan.account.dao.UserDao;
import com.zuoan.account.model.UserDO;
import com.zuoan.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by XUJY on 2016/1/19.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    //注册用户
    public boolean addUser(UserDO user) {
        int result = 0;
        result = userDao.insertUser(user);
        return result>0;
    }
    //修改用户
    public boolean modifyUser(UserDO user) {
        return true;
    }
    //删除用户
    public boolean removeUser(UserDO user) {
        return true;
    }
    //获取用户
    public UserDO getUser(UserDO user) {
        return null;
    }
    //通过userId获取用户
    public UserDO getUserByUserId(String userId) {
        return userDao.getUserByUserId(userId);
    }
    //分页查询用户
    public List<UserDO> queryUsers(UserDO user) {
        return null;
    }
}
