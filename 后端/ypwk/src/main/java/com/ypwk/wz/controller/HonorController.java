
package com.ypwk.wz.controller;

import com.ypwk.wz.common.JdonResult;

import com.ypwk.wz.entity.HonorEntity;
import com.ypwk.wz.service.HonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SpringBootConfiguration
@RequestMapping("/api/honor")
public class HonorController {

 @Autowired
    private HonorService honorService;
    //查询荣誉
    @GetMapping("/select")
    public JdonResult<List<HonorEntity>> selectHonorContoller(){

        return honorService.selectServicer();
    }
    //删除荣誉
    @RequestMapping("/delete/{id}")
    public JdonResult<Object> deleteByidController(@PathVariable int id){
        return   honorService.deleteByidService(id);
    }
    //新增荣誉
    @RequestMapping("/inster")
    public JdonResult<Object> instertHonorController(@RequestBody HonorEntity honorEntity){
        return honorService.instertHonorService(honorEntity);


    }
    //修改荣誉
    @PutMapping("/update")
    public JdonResult<Object> updateById(@RequestBody HonorEntity honorEntity ) {

        return honorService.updateByIdService(honorEntity);
    }
}


