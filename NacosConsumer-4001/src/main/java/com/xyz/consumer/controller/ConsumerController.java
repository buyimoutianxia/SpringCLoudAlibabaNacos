package com.xyz.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xyz
 * @date 2020-04-23-17:27
 * @decription Nacos消费端控制层
 */

@RestController
public class ConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.provider}")
    private String serviceName;

    @RequestMapping("/consumer/{path}")
    public String myConsumer(@PathVariable String path) {
        String requestpath = "http://" + serviceName + "/provider/" + path;
        System.out.println("request path:" + requestpath);

        return restTemplate.getForObject(requestpath, String.class);
    }
}
