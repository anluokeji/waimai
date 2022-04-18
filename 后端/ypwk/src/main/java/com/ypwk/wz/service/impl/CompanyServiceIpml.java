package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.CompanyDao;
import com.ypwk.wz.entity.Company;
import com.ypwk.wz.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceIpml implements CompanyService {
    @Autowired
    public CompanyDao companyDao;

    //判断查看公司信息是否成功
    @Override
    public JdonResult selectByName() {
        JdonResult objectJdonResult = new JdonResult();
        List<Company> companies = companyDao.selectByName();
        if (companies.size()==0) {
            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("暂无数据");
            return objectJdonResult;

        } else {
            objectJdonResult.setCode(200);
            objectJdonResult.setMessage("操作成功");
            objectJdonResult.setData(companies);
            return objectJdonResult;
        }
    }

    //判断是否删除成功
    @Override
    public JdonResult deleteById(int id) {
        JdonResult objectJdonResult = new JdonResult();
        Integer integer = companyDao.deleteById(id);
        if (integer.equals(1)) {
            objectJdonResult.setCode(200);
            objectJdonResult.setMessage("操作成功");
            return objectJdonResult;
        } else {
            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;

        }
    }

    //判断是否添加成功
    @Override
    public JdonResult insert(Company company) {
        JdonResult objectJdonResult = new JdonResult();
        Integer insert = companyDao.insert(company);
        if (insert!= 0) {
            objectJdonResult.setCode(200);
            objectJdonResult.setMessage("操作成功");
            objectJdonResult.setData(insert);
            return objectJdonResult;
        } else {
            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;

        }

    }

    //判断是否修改成功
    @Override
    public JdonResult updateById(Company company) {
        JdonResult objectJdonResult = new JdonResult();
        Integer integer = companyDao.updateById(company);
        if (integer != null) {
            objectJdonResult.setCode(200);
            objectJdonResult.setMessage("操作成功");
            return objectJdonResult;

        } else {
            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;

        }
    }
}

