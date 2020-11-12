package com.tank.sericefeign.service.impl;

import com.tank.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author tanlx
 * @description
 * @date 2020/11/11 20:38
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne() {
        return "error!sorry!";
    }
}
