package com.scholyars_management.scholyars_management.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode()
public class SysRole {
    private static final long serialVersionUID = 1L;


    private String name;


    private String code;

    /**
     * 备注
     */
    private String remark;

    @TableField(exist = false)
    private List<Long> menuIds = new ArrayList<>();
}
