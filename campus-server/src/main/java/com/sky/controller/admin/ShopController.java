package com.sky.controller.admin;

import com.sky.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController("adminShopController")
@RequestMapping("admin/shop")
@Slf4j
public class ShopController {

    public static final String KEY = "SHOP_STATUS";

    @Autowired
    private RedisTemplate redisTemplate;

    @PutMapping("/{status}")
    public Result setStatus(@PathVariable Integer status){
        log.info("设置平台状态：{}",status == 1 ? "运营中" : "维护中");
        try {
            redisTemplate.opsForValue().set(KEY, status);
        } catch (Exception e) {
            log.warn("Redis 连接失败，状态未能持久化");
        }
        return Result.success();
    }

    @GetMapping("/status")
    public Result<Integer> getStatus(){
        Integer status = null;
        try {
            status = (Integer) redisTemplate.opsForValue().get(KEY);
        } catch (Exception e) {
            log.warn("Redis 连接失败，默认返回运营中");
        }
        if (status == null) {
            status = 1;
        }
        log.info("获取平台状态：{}",status == 1 ? "运营中" : "维护中");
        return Result.success(status);
    }
}
