package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuluyang
 * @date 2021/6/1 下午10:21
 * @since 1.0.0-SNAPSHOT
 */
@Configuration
public class AplicationcontextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
