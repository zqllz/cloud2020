package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuluyang
 * @date 2021/7/3 下午3:36
 * @since 1.0.0-SNAPSHOT
 */
@RestController
public class PaymentController {

    @Value(("${server.port}"))
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos, port: " + serverPort + "\t + id: " + id;
    }
}
