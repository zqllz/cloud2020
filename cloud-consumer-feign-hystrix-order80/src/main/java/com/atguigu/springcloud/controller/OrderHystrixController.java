package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuluyang
 * @date 2021/6/16 上午12:06
 * @since 1.0.0-SNAPSHOT
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String PaymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.PaymentInfo_OK(id);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand
    //@HystrixCommand(fallbackMethod = "paymentTimeoutFallbackMethod", commandProperties = {
    //        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    //})
    public String PaymentInfo_Timeout(@PathVariable("id") Integer id){
        String result = paymentHystrixService.PaymentInfo_Timeout(id);
        return result;
    }

    public String paymentTimeoutFallbackMethod(@PathVariable("id") Integer id){
        return "消费者80，o(╥﹏╥)o";
    }

    // 下面是全局fallback
    public String payment_Global_FallbackMethod(){
        return "Gloube异常处理fallback";
    }
}
