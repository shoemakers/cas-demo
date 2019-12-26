package com.ygego.cas.test.application1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hongyuliu
 * @Date: 2019-12-26
 * @Version 1.0
 */
@RestController
@RequestMapping("/hello")
@EnableDiscoveryClient
@SpringBootApplication
public class TestApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication1.class,args);
    }

    @GetMapping
    public String test(){
        return "访问1服务成功";
    }
}
