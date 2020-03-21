package com.tangkc.febs.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // Eureka服务端功能
@SpringBootApplication
public class FebsRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FebsRegisterApplication.class, args);
    }

}
