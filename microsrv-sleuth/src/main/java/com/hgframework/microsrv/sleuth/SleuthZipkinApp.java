package com.hgframework.microsrv.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class SleuthZipkinApp {
    public static void main(String[] args) {
        SpringApplication.run(SleuthZipkinApp.class, args);
    }
}
