package com.liutl.eurekafeign.controller;

import com.liutl.eurekafeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping("/hi")
    public String sayHi(String name){
        return feignService.hi(name);
    }
}
