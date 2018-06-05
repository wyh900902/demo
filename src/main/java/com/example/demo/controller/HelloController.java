package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hello() {
        System.out.println("hello2");
        return "hello";
    }


    @GetMapping("/")
    public String index() {
        System.out.println("index2");
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        System.out.println("test");
        return "test";
    }

    @GetMapping("/wyh")
    public String wyh() {
        System.out.println("wyh");
        return "wyh";
    }

    @GetMapping("/new")
    public String newTest() {
        System.out.println("new");
        return "new";
    }
}
