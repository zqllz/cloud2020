package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    public String PaymentInfo_Timeout(Integer id){
        int timeNum = 5000;
        try {
            TimeUnit.MILLISECONDS.sleep(timeNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池" + Thread.currentThread().getName() + "paymentInfo_Timeout, id" + id + "\t" + "O(∩_∩)O哈哈~";
    }

    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池" + Thread.currentThread().getName() + "paymentInfo_TimeoutHandler, id" + id + "\t" + "o(╥﹏╥)o";
    }
}
