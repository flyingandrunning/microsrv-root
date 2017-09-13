package com.hgframework.microsrv.bizapp.orderapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2017/9/12 0012.
 */

@SpringBootApplication
@EnableEurekaClient
public class OrderApiApp {

    public static void main(String[] args) {
        SpringApplication.run(OrderApiApp.class, args);
    }
}
