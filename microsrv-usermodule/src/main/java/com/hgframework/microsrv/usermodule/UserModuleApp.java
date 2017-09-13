package com.hgframework.microsrv.usermodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
//启动spring boot服务
@SpringBootApplication
//注册服务
@EnableEurekaClient
//开启熔断机制
@EnableCircuitBreaker
//开启基于rpc远程调用
@EnableFeignClients
public class UserModuleApp {

    public static void main(String[] args) {
        SpringApplication.run(UserModuleApp.class, args);
    }
}
