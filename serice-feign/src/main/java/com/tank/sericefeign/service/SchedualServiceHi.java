package com.tank.sericefeign.service;

import com.tank.sericefeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tanlx
 * @description
 * @date 2020/11/10 21:01
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHiFromClientOne();

}
