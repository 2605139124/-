package com.zb.demo02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//服务提供者
@MapperScan(value = "com.zb.demo02.dao")
public class Demo02Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo02Application.class, args);
    }

}
