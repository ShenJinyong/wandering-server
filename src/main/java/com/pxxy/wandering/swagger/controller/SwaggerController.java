package com.pxxy.wandering.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    @GetMapping("/swaggerTest")
    public String swaggerTest(){
        return "Hello,world!";
    }
}
