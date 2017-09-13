package com.hgframework.microsrv.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@SpringBootApplication
//开启熔断器监控，这里有严格的板块控制，推荐用Dalston.RELEASE
@EnableHystrixDashboard
//开启多熔断器监控
@EnableTurbine
@EnableEurekaClient
public class DashboradApp {
    public static void main(String[] args) {
        SpringApplication.run(DashboradApp.class, args);
    }
}
