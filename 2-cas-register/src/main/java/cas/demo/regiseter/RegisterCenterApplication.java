package cas.demo.regiseter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: hongyuliu
 * @Date: 2019-12-23
 * @Version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterApplication.class, args);
    }
}
