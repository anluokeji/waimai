package com.scholyars_management.scholyars_management.service;

import com.scholyars_management.scholyars_management.pojo.SysMenu;

import java.util.List;

public interface SysMenuService {
 List<SysMenu> listByIds(List<Long> menuIds) ;
}
