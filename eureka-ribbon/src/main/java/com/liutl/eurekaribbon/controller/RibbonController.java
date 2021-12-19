package com.liutl.eurekaribbon.controller;

import com.liutl.eurekaribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi(String name){
        return ribbonService.hi(name);
    }
}
