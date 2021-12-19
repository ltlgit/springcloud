package com.liutl.eurekafeign.Interface;

import com.liutl.eurekafeign.conf.FeignHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client",fallback = FeignHystrix.class)
public interface FeignInterface {

    @GetMapping("/testClient/hi")
    String hiFromEurekaClient(String name);
}
