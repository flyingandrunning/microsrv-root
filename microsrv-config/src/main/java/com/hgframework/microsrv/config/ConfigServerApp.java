package com.hgframework.microsrv.config;


//如果需要注册到服务发现中心，请加上如下配置EnableEurekaClient，另外配置文件中

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * application.properties 需要加入余下配置以便服务发现，多个eureka可以配置多个，用逗号隔开即可
 * eureka.client.serviceUrl.defaultZone=http\://localhost\:8761/eureka/,http\://zlhost\:8762/eureka/
 * <p>
 * 文件配置格式
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 * <p>
 * application 根据spring.config.name来获得
 * profile 激活的剖面，比如spring.profiles.active = test
 * label git资源的label 默认是master
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
