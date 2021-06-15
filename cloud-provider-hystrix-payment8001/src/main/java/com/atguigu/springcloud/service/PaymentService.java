package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author yuluyang
 * @date 2021/6/15 下午11:15
 * @since 1.0.0-SNAPSHOT
 */
@Service
public class PaymentService {

    public String PaymentInfo_OK(Integer id){
        return "线程池" + Thread.currentThread().getName() + "paymentInfo_OK, id" + id + "\t" + "haha";
    }

    public String PaymentInfo_Timeout(Integer id){
        int timeNum = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池" + Thread.currentThread().getName() + "paymentInfo_Timeout, id" + id + "\t" + "haha";
    }
}
