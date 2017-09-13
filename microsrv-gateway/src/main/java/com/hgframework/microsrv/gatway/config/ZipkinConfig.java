package com.hgframework.microsrv.gatway.config;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
@Configuration
public class ZipkinConfig {

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }
}
