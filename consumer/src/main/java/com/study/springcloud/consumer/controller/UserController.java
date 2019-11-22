package com.study.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    HelloRemote helloRemote;
    @RequestMapping("/get/user/{id}")
    public String getHello(@PathVariable Integer id){
        return helloRemote.hello(id);
    }
}
