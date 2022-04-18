package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.HonorDao;
import com.ypwk.wz.entity.HonorEntity;
import com.ypwk.wz.service.HonorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class HonorServiceImpl implements HonorService {
     @Autowired
     private  HonorDao honorDao;
    JdonResult<Object> objectJsonResult = new JdonResult<>();

    public HonorServiceImpl(HonorDao honorDao) {
        this.honorDao = honorDao;
    }

    //查询荣誉
    @Override
    public JdonResult<List<HonorEntity>> selectServicer() {
        JdonResult<List<HonorEntity>> jsonResult=new JdonResult<>();
        List<HonorEntity> honorEntities = honorDao.selectHonorDao();
        if(honorEntities.size()==0 ){
            jsonResult.setCode(500);
            jsonResult.setMessage("查询失败");
            jsonResult.setData(honorEntities);

            return jsonResult;
        }else {
            jsonResult.setCode(200);
            jsonResult.setMessage("查询成功");
            jsonResult.setData(honorEntities);
            return jsonResult;
        }
    }

    @Override
    public JdonResult<Object> deleteByidService(int id) {
        Integer integer = honorDao.deleteByid(id);

        if(integer !=0){
            objectJsonResult .setCode(200);
            objectJsonResult .setMessage("删除成功");
            objectJsonResult .setData(integer);
            return objectJsonResult;
        }else {
            objectJsonResult .setCode(200);
            objectJsonResult .setMessage("删除失败");
            objectJsonResult .setData(integer);
            return objectJsonResult;
        }


    }

    @Override
    public JdonResult<Object> instertHonorService(HonorEntity honorEntity) {
        Integer integer = honorDao.instertHonorDao(honorEntity);
        if(integer !=null){
            objectJsonResult .setCode(200);
            objectJsonResult .setMessage("新增成功");
            objectJsonResult .setData(integer);
            return objectJsonResult;

        }else {
            objectJsonResult .setCode(500);
            objectJsonResult .setMessage("新增失败");
            objectJsonResult .setData(integer);
            return objectJsonResult;
        }
    }

    @Override
    public JdonResult<Object> updateByIdService(HonorEntity honorEntity) {
        Integer integer = honorDao.updateById(honorEntity);
        if (integer==null){
            objectJsonResult .setCode(500);
            objectJsonResult .setMessage("更新失败");
            objectJsonResult .setData(integer);
            return objectJsonResult;
        }else {
            objectJsonResult .setCode(200);
            objectJsonResult .setMessage("更新成功");
            objectJsonResult .setData(integer);
            return objectJsonResult;
        }

    }
}
