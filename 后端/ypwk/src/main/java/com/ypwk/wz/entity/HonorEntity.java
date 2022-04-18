package com.ypwk.wz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HonorEntity {
    private int id;
    private String awardee;//获奖人
    private String uname;//获奖名称
    private String company;//主办单位
}
