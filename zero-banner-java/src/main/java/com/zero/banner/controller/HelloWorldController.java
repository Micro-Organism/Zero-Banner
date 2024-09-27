package com.zero.banner.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/info")
    public Object showHelloWorld(){
        Map<String, Object> map = new HashMap<>();
        map.put("amagi", "I am a ikun.");
        return map;
    }

}