package com.tzl.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "spring-feign-provider",path = "/testFeign")  //声明调用的服务名称
public interface PersonClient {

    @GetMapping("/hello")
    String hello();
}
