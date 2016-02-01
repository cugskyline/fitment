package com.zuoan.account.dao;

import com.zuoan.account.model.UserDO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by XUJY on 2016/1/19.
 */
@Repository
public interface UserDao {
    //注册用户
    int insertUser(UserDO user);
    //修改用户
    int updateUser(UserDO user);
    //删除用户
    int deleteUser(String userId);
    //获取用户
    UserDO getUser(UserDO user);
    //通过userId获取用户
    UserDO getUserByUserId(String userId);
    //分页查询用户
    List<UserDO> queryUsers(UserDO user);
}
