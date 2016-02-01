package com.zuoan.account.resource;

import com.alibaba.fastjson.JSONObject;
import com.zuoan.account.model.UserDO;
import com.zuoan.account.service.UserService;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户管理
 * Created by XUJY on 2016/1/19.
 */
@RestController
@RequestMapping(value = "/user")
public class UserResource {
    /**
     * 日志实例
     */
    private static final Logger logger = LoggerFactory.getLogger(UserResource.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello", produces = "text/plain;charset=UTF-8")
    public String hello() {
        return "你好！hello";
    }

    @RequestMapping(value = "/say/{msg}", produces = "application/json;charset=UTF-8")
    public String say(@PathVariable(value = "msg") String msg) {
        logger.info("test");
        JSONObject json = new JSONObject();
        json.put("msg", "you say:" + msg);
        return json.toString();
    }

    /**
     * 根据id获取用户信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public UserDO getUser(@PathVariable("id") String id) {
        logger.info("获取人员信息id=" + id);
        UserDO user = userService.getUserByUserId(id);
        return user;
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/info/{id}", method = RequestMethod.DELETE)
    public Object deleteUser(@PathVariable("id") String id) {
        logger.info("删除人员信息id=" + id);
        JSONObject jsonObject = new JSONObject();
        if (userService.getUserByUserId(id) == null) {
            jsonObject.put("msg", "该用户不存在，删除失败");
            return jsonObject;
        }
        if (userService.removeUser(id)) {
            jsonObject.put("msg", "删除人员信息成功");
            return jsonObject;
        } else {
            jsonObject.put("msg", "删除人员信息失败");
            return jsonObject;
        }
    }

    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public Object addUser(UserDO user) {
        logger.info("注册人员信息成功id=" + user.getUserId());
        JSONObject jsonObject = new JSONObject();
       if (userService.addUser(user)){
           jsonObject.put("msg", "注册人员信息成功");
           return jsonObject;
       }else {
           jsonObject.put("msg", "注册人员信息失败");
           return jsonObject;
       }
    }

    /**
     * 更新用户信息
     * @param id
     * @param userDO
     * @return
     */
    @RequestMapping(value = "/info/{id}", method = RequestMethod.PUT)
    public Object updateUser(@PathVariable("id") String id, UserDO userDO) {
        logger.info("更新人员信息id=" + userDO.getUserId());
        JSONObject jsonObject = new JSONObject();
        if (userService.modifyUser(userDO)){
            jsonObject.put("msg", "更新人员信息成功");
            return jsonObject;
        }else {
            jsonObject.put("msg", "更新人员信息失败");
            return jsonObject;
        }
    }

    /**
     * 分页获取用户信息
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/User", method = RequestMethod.PATCH)
    public
    @ResponseBody
    List<UserDO> listUser(@RequestParam(value = "name", required = false, defaultValue = "") String name) {

        logger.info("查询人员name like " + name);
        List<UserDO> lstUsers = new ArrayList<UserDO>();

        return lstUsers;
    }
}
