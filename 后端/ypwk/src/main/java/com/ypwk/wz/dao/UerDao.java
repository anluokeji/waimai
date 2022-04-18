package com.ypwk.wz.dao;

import com.ypwk.wz.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface UerDao {
    @Select("select * from user where username=#{user.username} and password=#{user.password}")
    Integer login(@Param("user") User user);
    //查询用户
    @Select("select * from user order by id desc")
    List<User> selectUser();
    //新增用户
    @Insert({"insert into user (username,password)value (#{user.username},#{user.password})"})

    Integer insertUser(@Param("user") User user);
    //修改用户名
    @Update({"update user set username=#{user.username} where id=#{user.id}"})
    Integer updateUsername(@Param("user") User user);
    //修改密码
    @Update({"update user set password=#{user.password} where id=#{user.id}"})
    Integer updateUser(@Param("user") User user);
    //删除用户
    @Delete("delete from user where id=#{id}")
    Integer deleteUser(@Param("id") Integer id);
}
