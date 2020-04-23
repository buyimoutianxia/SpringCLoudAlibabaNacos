package com.xyz.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyz
 * @date 2020-04-23-22:57
 * @decription nacos client控制层
 * {@link RefreshScope} 实现配置的动态刷新
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${server.id}")
    private int id;

    @Value("${server.name}")
    private String name;

    /**
     * {@link Value} 获取不到配置的时候，使用默认配置
     */
    @Value("${server.desc: no desc}")
    private String desc;

    @RequestMapping("/config/list")
    public String getConfig() {
        return "id:" + id + ",name:" + name + ",desc:" + desc;
    }
}
