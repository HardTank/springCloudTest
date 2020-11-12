package com.tank.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author tanlx
 * @description
 * @date 2020/11/10 20:40
 */
@Service
public class HelloService {
    @Resource
    RestTemplate restTemplate;
   @HystrixCommand(fallbackMethod = "helloError")
    public String HiService() {
        return restTemplate.getForObject("http://SERVICE-HI/hello", String.class);
    }
    public String helloError() {
        return "hello,sorry,error!";
    }
}
