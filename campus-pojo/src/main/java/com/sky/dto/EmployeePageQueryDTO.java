package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeePageQueryDTO implements Serializable {

    //管理员名称
    private String name;

    //页码
    private int page;

    //每页显示记录数
    private int pageSize;

}
