package com.study.springcloud.producer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/{id}")
    public String getString(@PathVariable Integer id){
        return "你要找id为："+id+"的人吗？";
    }
}
