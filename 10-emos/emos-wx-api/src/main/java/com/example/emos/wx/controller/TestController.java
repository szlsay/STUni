package com.example.emos.wx.controller;

//import com.example.emos.wx.common.util.R;
//import com.example.emos.wx.controller.form.TestSayHelloForm;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.apache.shiro.authz.annotation.Logical;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;

import com.example.emos.wx.common.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api("测试Web接口")
public class TestController {
    @PostMapping("/sayHello")
    @ApiOperation("最简单的测试方法")
    public R sayHello(){
        return R.ok().put("message", "HelloWorld");
    }
//    public R sayHello(@Valid @RequestBody TestSayHelloForm form) {
//        return R.ok().put("message", "Hello,"+form.getName());
//    }

    @GetMapping("/hi")
    public R hi(){
        return R.ok();
    }

//    @PostMapping("/addUser")
//    @ApiOperation("添加用户")
//    @RequiresPermissions(value = {"A","B"},logical = Logical.OR)
//    public R addUser(){
//        return R.ok("用户添加成功");
//    }


}
