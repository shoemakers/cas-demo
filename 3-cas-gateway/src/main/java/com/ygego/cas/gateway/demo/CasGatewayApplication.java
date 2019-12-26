package com.ygego.cas.gateway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hongyuliu
 * @Date: 2019-12-25
 * @Version 1.0
 */
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class CasGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(CasGatewayApplication.class,args);
    }

}
