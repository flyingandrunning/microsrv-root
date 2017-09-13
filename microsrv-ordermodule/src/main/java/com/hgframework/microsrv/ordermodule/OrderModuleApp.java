package com.hgframework.microsrv.ordermodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients
public class OrderModuleApp {

    public static void main(String[] args) {
        SpringApplication.run(OrderModuleApp.class, args);
    }
}
