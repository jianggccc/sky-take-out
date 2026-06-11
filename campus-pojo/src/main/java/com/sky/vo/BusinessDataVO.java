package com.sky.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 数据概览
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusinessDataVO implements Serializable {

    private Double turnover;//交易额

    private Integer validOrderCount;//有效任务单数

    private Double orderCompletionRate;//任务单完成率

    private Double unitPrice;//平均客单价

    private Integer newUsers;//新增用户数

}
