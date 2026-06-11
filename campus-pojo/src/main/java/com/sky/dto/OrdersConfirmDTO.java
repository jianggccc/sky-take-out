package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrdersConfirmDTO implements Serializable {

    private Long id;
    //任务状态 1待付款 2待接单 3 已接单 4 进行中 5 已完成 6 已取消 7 退款
    private Integer status;

}
