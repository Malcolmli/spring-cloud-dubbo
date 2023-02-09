package com.mc.provider;

import com.mc.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHi(String name) {
        return "Hello " + name;
    }
}
