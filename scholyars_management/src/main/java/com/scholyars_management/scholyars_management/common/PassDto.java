package com.scholyars_management.scholyars_management.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class PassDto implements Serializable {
    private String password;

    private String currentPass;
}
