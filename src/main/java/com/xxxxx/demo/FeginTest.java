package com.xxxxx.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("demo-server1")
public interface FeginTest {
    @GetMapping("getDemo1")
    public String getDemo1();
}
