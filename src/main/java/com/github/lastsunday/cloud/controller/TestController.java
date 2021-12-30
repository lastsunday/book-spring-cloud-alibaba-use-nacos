package com.github.lastsunday.cloud.controller;

import com.github.lastsunday.cloud.service.PayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private PayService payService;

    //access address http://localhost:7832/test
    @GetMapping(value="/test")
    public String test(){
        return payService.pay();
    }
}
