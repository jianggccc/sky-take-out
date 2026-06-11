package com.sky.service;

import com.sky.vo.BusinessDataVO;
import com.sky.vo.DishOverViewVO;
import com.sky.vo.OrderOverViewVO;
import com.sky.vo.SetmealOverViewVO;
import java.time.LocalDateTime;

public interface WorkspaceService {

    /**
     * 根据时间段统计营业数据
     * @param begin
     * @param end
     * @return
     */
    BusinessDataVO getBusinessData(LocalDateTime begin, LocalDateTime end);

    /**
     * 查询任务管理数据
     * @return
     */
    OrderOverViewVO getOrderOverView();

    /**
     * 查询服务总览
     * @return
     */
    DishOverViewVO getDishOverView();

    /**
     * 查询活动总览
     * @return
     */
    SetmealOverViewVO getSetmealOverView();

}
