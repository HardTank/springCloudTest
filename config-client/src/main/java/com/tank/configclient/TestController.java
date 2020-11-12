package com.tank.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanlx
 * @description
 * @date 2020/11/11 21:42
 */
@RestController
public class TestController {
    @Value("${foo}")
    String foo;
 //   @Value("${spring.rabbitmq.host}")
    String mq;

    @GetMapping("test")
    public String test() {
        return foo + mq;
    }
}
