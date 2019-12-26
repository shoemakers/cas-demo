package com.ygego.cas.gateway1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: hongyuliu
 * @Date: 2019-12-25
 * @Version 1.0
 */
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class CasGateway1Application {
    public static void main(String[] args) {
        SpringApplication.run(CasGateway1Application.class,args);
    }

}
