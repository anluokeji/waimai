package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.ContactDao;
import com.ypwk.wz.entity.Contact;
import com.ypwk.wz.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    public ContactDao contactDao;

    @Override
    public JdonResult select() {
        List<Contact> select = contactDao.select();

        JdonResult objectJdonResultult = new JdonResult();

        if (select == null) {
            objectJdonResultult.setCode(500);
            objectJdonResultult.setMessage("操作失败");
            return objectJdonResultult;

        } else {
            objectJdonResultult.setCode(200);
            objectJdonResultult.setMessage("操作成功");
            objectJdonResultult.setData(select);
            return objectJdonResultult;
        }
    }


    //删除
    public JdonResult deleteById(int id) {

        JdonResult objectJdonResultult = new JdonResult();
        Integer integer = contactDao.deleteById(id);
        if (integer.equals(1)) {
            objectJdonResultult.setCode(200);;
            objectJdonResultult.setMessage("操作成功");
            return objectJdonResultult;

        } else {

            objectJdonResultult.setCode(500);;
            objectJdonResultult.setMessage("操作失败");
            return objectJdonResultult;
        }
    }

    //添加
    @Override
    public JdonResult insert(Contact contact) {

        JdonResult objectJdonResult = new JdonResult();
        Integer insert = contactDao.insert(contact);
        if (insert != null) {
            objectJdonResult.setCode(200);
            objectJdonResult.setMessage("操作成功");
            return objectJdonResult;
        } else {
            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;
        }
    }
    //更新
    @Override
    public JdonResult updateById(Contact contact) {

        Integer integer = contactDao.updateById(contact);

        JdonResult objectJdonResult = new JdonResult();
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
