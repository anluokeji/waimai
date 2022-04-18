package com.ypwk.wz.service;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.HonorEntity;

import java.util.List;

public interface HonorService {
    //查询
    JdonResult<List<HonorEntity>> selectServicer();
    //删除
    JdonResult<Object> deleteByidService(int id);
    //新增
    JdonResult<Object>instertHonorService(HonorEntity honorEntity);
    //修改
    JdonResult<Object> updateByIdService(HonorEntity honorEntity);
}
