package com.xxxxx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private FeginTest feginTest;

    @GetMapping("sendDemo")
    public String sendDemo() {
        return feginTest.getDemo1();
    }
}
