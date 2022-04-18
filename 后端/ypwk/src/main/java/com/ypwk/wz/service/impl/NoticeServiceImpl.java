package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.NoticeDao;
import com.ypwk.wz.entity.News;
import com.ypwk.wz.entity.Notice;
import com.ypwk.wz.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    public NoticeDao noticeDao;

    //判断查询新闻内容是否成功
    @Override
    public JdonResult select() {

        JdonResult objectJdonResultult = new JdonResult();
        List<Notice> select = noticeDao.select();
        if (select == null) {

            objectJdonResultult.setMessage("操作失败");
            objectJdonResultult.setCode(500);
            return objectJdonResultult;
        } else {

            objectJdonResultult.setMessage("操作成功");
            objectJdonResultult.setCode(200);
            objectJdonResultult.setData(select);
            return objectJdonResultult;
        }
    }


    //通过id删除新闻内容
    @Override
    public JdonResult deleteById(int id) {

        JdonResult objectJdonResultult = new JdonResult();
        Integer integer = noticeDao.deleteById(id);
        if (integer.equals(1)) {

            objectJdonResultult.setCode(200);
            objectJdonResultult.setMessage("操作成功");
            return objectJdonResultult;
        } else {

            objectJdonResultult.setCode(500);
            objectJdonResultult.setMessage("操作失败");
            return objectJdonResultult;
        }
    }


    //添加新闻内容
    @Override
    public JdonResult insert(Notice notice) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());
        notice.setTime(date);
        JdonResult objectJdonResult = new JdonResult();
        Integer insert = noticeDao.insert(notice);
        if (insert != null) {

            objectJdonResult.setMessage("操作成功");
            objectJdonResult.setCode(200);
        return objectJdonResult;
        } else {

            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;
        }
    }

    //修改新闻内容
    @Override
    public JdonResult updateById(Notice notice) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());
        notice.setTime(date);
        Integer integer = noticeDao.updateById(notice);
        JdonResult objectJdonResult = new JdonResult();
        if (integer!= null) {

            objectJdonResult.setMessage("操作成功");
            objectJdonResult.setCode(200);
            return objectJdonResult;
        } else {

            objectJdonResult.setMessage("操作失败");
            objectJdonResult.setCode(500);
            return objectJdonResult;
        }
    }
}
