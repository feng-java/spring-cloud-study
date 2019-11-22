package com.study.springcloud.consumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(@PathVariable Integer id) {
        return "你要找的id为:"+id+"的人失败了，因为服务没有响应！";
    }
}
