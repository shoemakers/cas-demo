package com.ygego.cas.test.application2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.PostVMInitHook;

/**
 * @Author: hongyuliu
 * @Date: 2019-12-26
 * @Version 1.0
 */
@RestController
@RequestMapping("/hello")
@EnableDiscoveryClient
@SpringBootApplication
public class TestApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication2.class,args);
    }

    @GetMapping
    public String test(){
        return "访问2服务成功";
    }
}
