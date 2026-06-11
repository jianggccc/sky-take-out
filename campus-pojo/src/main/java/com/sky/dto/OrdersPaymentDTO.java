package com.sky.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class OrdersPaymentDTO implements Serializable {
    //任务单号
    private String orderNumber;

    //付款方式
    private Integer payMethod;

}
