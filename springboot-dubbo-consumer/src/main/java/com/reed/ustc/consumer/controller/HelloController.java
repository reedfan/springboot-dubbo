package com.reed.ustc.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.reed.ustc.provider.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by reedfan on 2019/1/10 0010
 */

@RestController
public class HelloController {
    @Reference(check = false)
    private UserService userService;

    @GetMapping(value = "/getusers")
    public List<String> getUsers(){
        return userService.getUsers();
    }




}
