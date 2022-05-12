package com.scholyars_management.scholyars_management.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.scholyars_management.scholyars_management.pojo.SysRole;

import java.util.List;

public interface SysRoleService {

    List<SysRole> listRolesByUserId(Long userId);

    List<SysRole> list(QueryWrapper<SysRole> id);
}
