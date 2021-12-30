package com.github.lastsunday.cloud.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "use-nacos",version = "1.0.0")
public class PayServiceImpl implements PayService{
    @Override
    public String pay() {
        return "payResult";
    }
}
