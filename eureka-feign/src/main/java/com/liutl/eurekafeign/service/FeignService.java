package com.liutl.eurekafeign.service;

import com.liutl.eurekafeign.Interface.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {

    @Autowired
    FeignInterface feignInterface;

    public String hi(String name){
        return feignInterface.hiFromEurekaClient(name);
    }
}
