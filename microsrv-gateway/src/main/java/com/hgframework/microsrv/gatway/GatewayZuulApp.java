package com.hgframework.microsrv.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2017/9/8 0008.
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class GatewayZuulApp {


    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulApp.class, args);

    }
}
