package com.ypwk.wz.dao;
import com.ypwk.wz.entity.HonorEntity;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface HonorDao {
    //查询荣誉
    @Select("select * from honor")
    List<HonorEntity> selectHonorDao();
    //删除荣誉
    @Delete("delete from honor where id=#{id} ")
    Integer deleteByid(@Param("id") int id);

    //新增荣誉
    @Insert({"insert into honor (awardee,uname,company)values(#{honorEntity.awardee},#{honorEntity.uname},#{honorEntity.company})"})
    Integer instertHonorDao(@Param("honorEntity") HonorEntity honorEntity);
    //修改荣誉
    @Update({"update honor set awardee=#{honorEntity.awardee},uname=#{honorEntity.uname},company=#{honorEntity.company} where id=#{honorEntity.id}"})
    Integer updateById(@Param("honorEntity") HonorEntity honorEntity);
}
