package com.ypwk.wz.dao;

import com.ypwk.wz.entity.Company;
import com.ypwk.wz.entity.SysAlentity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface SysAlDao {
    //查寻案例
    @Select("select * from al order by id desc limit 6")
    List<SysAlentity> SelectAlDao() ;
    //新增案例
    @Insert("insert into al (alm,aljs,tplj) values (#{sysAlentity.alm},#{sysAlentity.aljs},#{sysAlentity.tplj})")
    Integer InsertAlDao(@Param("sysAlentity") SysAlentity sysAlentity);
    //修改案例
    @Update({"update al honor set alm=#{sysAlentity.alm},aljs=#{sysAlentity.aljs},tplj=#{sysAlentity.tplj} where id=#{sysAlentity.id}"})
    Integer updateAlDao(@Param("sysAlentity") SysAlentity sysAlentity);

    //通过id删除案例信息
    @Delete("delete from al where id=#{id}")
    Integer deleteById(@Param("id") Integer id);


}

