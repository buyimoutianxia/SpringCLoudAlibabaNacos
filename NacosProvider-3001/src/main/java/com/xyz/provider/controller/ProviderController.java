package com.xyz.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyz
 * @date 2020-04-23-15:04
 * @decription Nacos服务提供者控制层
 */

@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/provider/{path}")
    public String demo(@PathVariable(value = "path") String path) {
       return "Nacos Provider path:" + path + ",port:" + port ;
    }
}
