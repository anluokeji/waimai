package com.scholyars_management.scholyars_management.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BaseEntity{
    private  int id;
    private String username;
    private String password;



}
