package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.UerDao;
import com.ypwk.wz.entity.User;
import com.ypwk.wz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UerDao uerDao;

    @Override
    public JdonResult login(User user) {
        Integer login = uerDao.login(user);
        JdonResult objectJdonResult = new JdonResult();
        if (login == null) {
            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("登录失败");
            return objectJdonResult;
        } else {
            objectJdonResult.setCode(200);
            objectJdonResult.setMessage("登录成功");
            return objectJdonResult;
        }
    }

    //查看用户
    @Override
    public JdonResult<List<User>> selectUserService() {
        JdonResult<List<User>> objectJdonResult = new JdonResult<>();
        List<User> users = uerDao.selectUser();
        if (users==null){
            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("暂无用户");
            objectJdonResult.setData(users);
            return objectJdonResult;
        }else {
            objectJdonResult.setCode(200);
            objectJdonResult.setMessage("查询成功");
            objectJdonResult.setData(users);
            return objectJdonResult;
        }


    }

    //新增用户
    @Override
    public JdonResult<Object> insertUserService(User user) {
        Integer integer = uerDao.insertUser(user);
        JdonResult<Object>jdonResult=new JdonResult<>();
        if (integer==0){
            jdonResult.setCode(500);
            jdonResult.setMessage("增加失败");
            jdonResult.setData(integer);
            return jdonResult;
        }
        else {
            jdonResult.setCode(200);
            jdonResult.setMessage("增加成功");
            jdonResult.setData(integer);
            return jdonResult;
        }

    }
    //修改用户名
    @Override
    public JdonResult<Object> updateUsernameService(User user) {
        Integer integer = uerDao.updateUsername(user);
        JdonResult<Object>jdonResult=new JdonResult<>();
        if(user.getUsername()==null){
            jdonResult.setCode(500);
            jdonResult.setMessage("修改失败");

            jdonResult.setData(integer);
            return jdonResult;
        }else {
            jdonResult.setCode(200);
            jdonResult.setMessage("修改成功");
            jdonResult.setData(user.getUsername());
            //jdonResult.setData(integer);
            return jdonResult;
        }
    }

    //修改密码
    @Override
    public JdonResult<Object> updateUserService(User user) {
        Integer integer = uerDao.updateUser(user);
        JdonResult<Object>jdonResult=new JdonResult<>();
        if(user.getPassword()==null){
            jdonResult.setCode(500);
            jdonResult.setMessage("修改失败");
            jdonResult.setData(user.getPassword());
            jdonResult.setData(integer);
            return jdonResult;
        }else {
            jdonResult.setCode(200);
            jdonResult.setMessage("修改成功");
            jdonResult.setData(user.getPassword());
            //jdonResult.setData(integer);
            return jdonResult;
        }


    }
    //删除用户
    @Override
    public JdonResult<Object> deleteUserService(Integer id) {
        Integer integer = uerDao.deleteUser(id);
        JdonResult<Object>jdonResult=new JdonResult<>();
        if (integer==0){
            jdonResult.setCode(500);
            jdonResult.setMessage("删除失败");
            jdonResult.setData(integer);
            return jdonResult;
        }else {
            jdonResult.setCode(200);
            jdonResult.setMessage("删除成功");
            jdonResult.setData(integer);
            return jdonResult;

        }

    }
}
