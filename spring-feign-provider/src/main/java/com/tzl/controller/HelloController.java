package com.tzl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testFeign")
public class HelloController {

    @GetMapping(value = "/hello")
    public void sayHello(){
        System.out.println("Hello World!!!!");
    }
}
