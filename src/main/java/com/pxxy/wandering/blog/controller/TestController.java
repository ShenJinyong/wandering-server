package com.pxxy.wandering.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/Test")
    public String swaggerTest(){
        return "Hello,world!";
    }

}
