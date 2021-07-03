package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yuluyang
 * @date 2021/7/3 上午2:46
 * @since 1.0.0-SNAPSHOT
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumerMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerMain8803.class, args);
    }
}
