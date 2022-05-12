package com.scholyars_management.scholyars_management.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.scholyars_management.scholyars_management.mapper.SysUserMapper;
import com.scholyars_management.scholyars_management.pojo.SysUser;

import java.util.List;

public interface SysUserService {
    SysUserMapper getByUsername(String username) ;

    String getUserAuthorityInfo(Long userId) ;

    void clearUserAuthorityInfo(String username);

    void clearUserAuthorityInfoByRoleId(Long roleId);

    void clearUserAuthorityInfoByMenuId(Long menuId);

    SysUser getById(Long id);

    void updateById(SysUser sysUser);

    List<SysUser> list(QueryWrapper<SysUser> id);
}
