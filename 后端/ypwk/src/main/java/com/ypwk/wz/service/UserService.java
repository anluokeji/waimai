package com.ypwk.wz.service;


import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.User;

import java.util.List;

public interface UserService {
    JdonResult login(User user);
    //查看用户
    JdonResult<List<User>>selectUserService();
    //新增用户
    JdonResult<Object>insertUserService(User user);
    //修改用户名
    JdonResult<Object>updateUsernameService(User user);
    //修改密码

    JdonResult<Object> updateUserService( User user);
    //删除用户

    JdonResult<Object> deleteUserService( Integer id);
}
