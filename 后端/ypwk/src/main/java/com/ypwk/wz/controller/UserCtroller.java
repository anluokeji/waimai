package com.ypwk.wz.controller;


import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.User;
import com.ypwk.wz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootConfiguration
@RestController
@RequestMapping("/api/user")
public class UserCtroller {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public JdonResult login(@RequestBody User user){
        return userService.login(user);

    }
    //查看用户
    @GetMapping("/select")
    public JdonResult<List<User>>selectUserController(){
        return userService.selectUserService();
    }
    //新增用户
    @PostMapping("/insert")
    public JdonResult<Object> insertUserController(@RequestBody User user){
        return userService.insertUserService(user);
    }
    //修改用户名
    @PutMapping("/updateName")
    public JdonResult<Object>updateUsernameController(@RequestBody User user){
        return userService.updateUsernameService(user);
    }

    //修改密码
    @PutMapping ("/update")
    public JdonResult<Object> updateUserController(@RequestBody User user){
        return userService.updateUserService(user);
    }
    @DeleteMapping("/delete/{id}")
    public JdonResult<Object> deleteUserController(@PathVariable("id") Integer id){
        return userService.deleteUserService(id);
    }
}
