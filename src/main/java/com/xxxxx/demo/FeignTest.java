package com.xxxxx.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 金世强
 */
@FeignClient("demo-server1")
public interface FeignTest {

    /**
     * 测试
     *
     * @return 测试
     */
    @GetMapping("getDemo1")
    String getDemo1();
}
