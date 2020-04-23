package com.xyz.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xyz
 * @date 2020-04-23-14:36
 * @decription Nacos Provider启动类
 * {@link EnableDiscoveryClient}开启Nacos的服务发现
 */


@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
