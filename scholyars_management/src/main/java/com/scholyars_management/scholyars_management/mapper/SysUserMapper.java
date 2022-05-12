package com.scholyars_management.scholyars_management.mapper;

import com.scholyars_management.scholyars_management.pojo.SysUser;

import java.util.List;

public interface SysUserMapper {
     SysUserMapper getByUsername(String username) ;

     SysUser selectById(Long userId);

     List<Long> getNavMenuIds(Long userId);

     List<SysUser> listByMenuId(Long menuId);
}
