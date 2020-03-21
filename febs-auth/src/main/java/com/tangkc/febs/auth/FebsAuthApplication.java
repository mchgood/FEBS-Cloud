package com.tangkc.febs.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 启服务注册与发现功能
@EnableDiscoveryClient
@SpringBootApplication
public class FebsAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(FebsAuthApplication.class, args);
    }

}
