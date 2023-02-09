package com.mc.consumer;

import com.mc.api.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @DubboReference
    private DemoService demoService;

    @PostMapping("demo/dubbo")
    public String demo(String name) {
        return demoService.sayHi(name);
    }
}
