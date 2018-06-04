package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }


    @GetMapping("/")
    public String index() {
        System.out.println("index");
        return "index";
    }
}
