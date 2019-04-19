package com.example.swaggerdemo.swagger.controller;

import com.alibaba.fastjson.JSON;
import com.example.swaggerdemo.swagger.entity.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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

    @GetMapping("/hello/{id}")
    @ApiOperation(tags = "HelloController",value = "这是一个Get测试方法")
    public String hello(@PathVariable(value = "id")String id){
        return String.format("HelloWorld_%s",id);
    }

    @PostMapping("/call")
    @ApiOperation(tags = "HelloController",value = "这是一个Post测试方法")
    public String recall(@RequestBody SysUser sysUser){
        if(null == sysUser){
            sysUser = SysUser.getInstance();
        }
        return JSON.toJSONString(sysUser);
    }

    @RequestMapping(value = "/updatePassword",method = RequestMethod.POST)
    @ApiOperation(tags = "HelloController",value="修改用户密码", notes="根据用户id修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "password", value = "旧密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "newPassword", value = "新密码", required = true, dataType = "String")
    })
    public String updatePassword(@RequestParam(value="userId") Integer userId, @RequestParam(value="password") String password,
                                 @RequestParam(value="newPassword") String newPassword){
        if(userId <= 0 || userId > 2){
            return "未知的用户";
        }
        if(StringUtils.isEmpty(password) || StringUtils.isEmpty(newPassword)){
            return "密码不能为空";
        }
        if(password.equals(newPassword)){
            return "新旧密码不能相同";
        }
        return "密码修改成功!";
    }
}
