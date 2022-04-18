package com.ypwk.wz.controller;
import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.SysAlentity;
import com.ypwk.wz.service.ALservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//案例
@SpringBootConfiguration
@RestController
@RequestMapping("/api/an")
public class AlController {
    //查询anli
    @Autowired
    private ALservice aLservice;
    @GetMapping("/select")
    public JdonResult<SysAlentity> SelectAlController(){
        System.out.println(aLservice.SelectAlservice());
        return aLservice.SelectAlservice();
    }
    @PostMapping("/insert")
    public JdonResult insert(@RequestBody SysAlentity sysAlentity) {
        return aLservice.InsertAlServie(sysAlentity);

    }
    //修改案例信息
    @PutMapping("/update")
    public JdonResult updateById(@RequestBody SysAlentity sysAlentity) {

        return aLservice.updateAlService(sysAlentity);
    }

    //删除案例
    @DeleteMapping("/delete{id}")
    public JdonResult<Object> deleteById(@PathVariable("id") Integer id) {

        return aLservice.deleteById(id);
    }
}
