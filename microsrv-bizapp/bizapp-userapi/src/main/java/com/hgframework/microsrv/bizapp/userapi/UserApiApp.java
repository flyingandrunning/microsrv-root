package com.hgframework.microsrv.bizapp.userapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@EnableEurekaClient
@SpringBootApplication
public class UserApiApp {

    public static void main(String[] args) {
        SpringApplication.run(UserApiApp.class, args);
    }
}
