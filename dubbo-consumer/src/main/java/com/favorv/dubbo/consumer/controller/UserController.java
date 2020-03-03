package com.favorv.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.favorv.dubbo.common.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //timeout 可以不指定，但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20880"
    @Reference
    private UserService userService;

    @GetMapping("/dubbo/user/{id}")
    public String getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

}
