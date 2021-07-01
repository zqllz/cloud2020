package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuluyang
 * @date 2021/6/30 下午11:52
 * @since 1.0.0-SNAPSHOT
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String cnfigInfo(){
        return "serverPort: " + serverPort + "\t\n\n configInfo: " + configInfo;
    }
}
