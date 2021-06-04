package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author yuluyang
 * @date 2021/5/31 上午12:26
 * @since 1.0.0-SNAPSHOT
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
