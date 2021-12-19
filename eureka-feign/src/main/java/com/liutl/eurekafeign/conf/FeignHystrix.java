package com.liutl.eurekafeign.conf;

import com.liutl.eurekafeign.Interface.FeignInterface;
import org.springframework.stereotype.Component;

@Component
public class FeignHystrix implements FeignInterface {
    @Override
    public String hiFromEurekaClient(String name) {
        return "name:"+name+",error";
    }
}
