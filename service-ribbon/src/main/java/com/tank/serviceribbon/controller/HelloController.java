package com.tank.serviceribbon.controller;

import com.tank.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tanlx
 * @description
 * @date 2020/11/10 20:44
 */
@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.HiService();
    }
}
