package com.hgframework.microsrv.bizapp.userapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@EnableEurekaClient
@SpringBootApplication
/*
运行时发现有配置更新的时候，通过调用RefreshScope.refresh(beanName)或RefreshScope.refreshAll()，
从而下次这些bean被使用时会被重新初始化，进而会被重新注入值，所以也就达到了更新的目的。
 也可以在配置文件配置刷新时间间隔
  */
@RefreshScope
public class UserApiApp {

    public static void main(String[] args) {
        SpringApplication.run(UserApiApp.class, args);
    }
}
