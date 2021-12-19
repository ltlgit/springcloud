package com.liutl.eurekaclient_1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/testClient")
public class TestClientController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(String name){
        return "hi "+name+",port :"+port;
    }

    @GetMapping("/testRest")
    public String testRest(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.baidu.com/",String.class);
    }
}
