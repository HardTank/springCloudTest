package com.tank.sericefeign;

import com.tank.sericefeign.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tanlx
 * @description
 * @date 2020/11/10 21:02
 */
@RestController
public class HelloController {
    @Resource
    SchedualServiceHi schedualServiceHi;
    @GetMapping("hello")
    public String hello() {
        return schedualServiceHi.sayHiFromClientOne();
    }
}
