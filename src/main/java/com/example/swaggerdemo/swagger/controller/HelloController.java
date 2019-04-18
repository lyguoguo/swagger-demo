package com.example.swaggerdemo.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.example.swaggerdemo.swagger.controller
 * @date:2019/4/18
 **/
@RestController
@RequestMapping("/demo")
@Api(tags = "HelloController",value = "这是一个演示控制器")
public class HelloController {

    @PostMapping("/hello/{id}")
    @ApiOperation(tags = "HelloController",value = "这是一个测试方法")
    public String hello(@PathVariable(value = "id")String id){
        return String.format("HelloWorld_%s",id);
    }
}
