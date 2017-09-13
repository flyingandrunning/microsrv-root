package com.hgframework.microsrv.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class, args);
    }
}
