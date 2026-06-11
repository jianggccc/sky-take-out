package com.sky.controller.user;

import com.sky.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController("userShopController")
@RequestMapping("user/shop")
@Slf4j
public class ShopController {

    public static final String KEY = "SHOP_STATUS";

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/status")
    public Result<Integer> getStatus(){
        Integer status = null;
        try {
            status = (Integer) redisTemplate.opsForValue().get(KEY);
        } catch (Exception e) {
            log.warn("Redis 连接失败，默认返回运营中");
        }
        if (status == null) {
            status = 1; // 默认运营中
        }
        log.info("获取平台状态：{}", status == 1 ? "运营中" : "维护中");
        return Result.success(status);
    }
}
