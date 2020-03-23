package com.tzl.controller;

import com.tzl.client.PersonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class InvokerController {

   @Autowired
   private PersonClient personClient;

    @GetMapping(value = "/invokerHello")
    public String invokerHello(){
        return personClient.hello();
    }

}
