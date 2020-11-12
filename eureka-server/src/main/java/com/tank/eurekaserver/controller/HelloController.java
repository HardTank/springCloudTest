package com.tank.eurekaserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanlx
 * @description
 * @date 2020/11/10 20:15
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello() {
        return "hello word";
    }
}
