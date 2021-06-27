package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author yuluyang
 * @date 2021/6/27 下午12:11
 * @since 1.0.0-SNAPSHOT
 */
@Component 
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String PaymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall back PaymentInfo_OK";
    }

    @Override
    public String PaymentInfo_Timeout(Integer id) {
        return "PaymentFallbackService fall back PaymentInfo_Timeout";
    }
}
