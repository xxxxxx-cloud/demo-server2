package com.xxxxx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 金世强
 */
@RestController
public class DemoController {

    private final FeignTest feignTest;

    @Autowired
    public DemoController(FeignTest feignTest) {
        this.feignTest = feignTest;
    }

    @GetMapping("sendDemo")
    public String sendDemo() {
        return feignTest.getDemo1();
    }
}
