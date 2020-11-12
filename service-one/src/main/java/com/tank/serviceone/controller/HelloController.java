package com.tank.serviceone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanlx
 * @description
 * @date 2020/11/10 20:15
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @RequestMapping("hello")
    public String hello() {
        return "hello word current port is:"+port;
    }
}
