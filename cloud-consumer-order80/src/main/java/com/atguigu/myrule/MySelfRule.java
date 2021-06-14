package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuluyang
 * @date 2021/6/14 下午8:05
 * @since 1.0.0-SNAPSHOT
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule muRule(){
        return new RandomRule();
    }
}
