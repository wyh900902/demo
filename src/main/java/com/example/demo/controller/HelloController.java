package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试", description = "测试功能")
public class HelloController {
    /**
     * @param s
     * @return
     */
    @ApiOperation("测试路劲hi")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "s", value = "条件", required = true)
    })
    @GetMapping("/hi")
    public String hello(String s) {
        System.out.println("hello2");
        return "hello";
    }


    /**
     * @return
     */
    @GetMapping("/")
    public String index() {
        System.out.println("index2");
        return "index";
    }

    /**
     * @return
     */
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

    @GetMapping("/huige")
    public String huige() {
        System.out.println("huige");
        return "huige";
    }
}
