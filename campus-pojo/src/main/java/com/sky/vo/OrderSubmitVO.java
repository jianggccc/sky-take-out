package com.sky.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderSubmitVO implements Serializable {
    //任务id
    private Long id;
    //任务单号
    private String orderNumber;
    //任务金额
    private BigDecimal orderAmount;
    //下单时间
    private LocalDateTime orderTime;
}
