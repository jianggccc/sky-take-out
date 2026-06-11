package com.sky.vo;

import com.sky.entity.DishFlavor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DishVO implements Serializable {

    private Long id;
    //服务名称
    private String name;
    //服务分类id
    private Long categoryId;
    //服务价格
    private BigDecimal price;
    //图片
    private String image;
    //描述信息
    private String description;
    //0 下架 1 上架
    private Integer status;
    //更新时间
    private LocalDateTime updateTime;
    //分类名称
    private String categoryName;
    //服务关联的规格说明
    private List<DishFlavor> flavors = new ArrayList<>();

    //private Integer copies;
}
