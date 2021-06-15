package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuluyang
 * @date 2021/6/15 下午11:17
 * @since 1.0.0-SNAPSHOT
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String PaymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.PaymentInfo_OK(id);
        log.info("****result: " + result + "****");
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String PaymentInfo_Timeout(@PathVariable("id") Integer id){
        String result = paymentService.PaymentInfo_Timeout(id);
        log.info("****result: " + result + "****");
        return result;
    }
}
