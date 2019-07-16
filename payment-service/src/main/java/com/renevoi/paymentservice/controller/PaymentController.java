package com.renevoi.paymentservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {

    @Value("${server.port}")
    private String portNum;

    @GetMapping("/payNow/{price}")
    public String payNow(@PathVariable int price) {
        return "Hello There from Payment service. The price you've paid is: " + price + ". Port used: " + portNum;
    }

    @GetMapping("/pay")
    public String getPay() {
        return "WOOOOORKKKIING";
    }
}
