package com.favorv.dubbo.provider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.favorv.dubbo.common.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    //timeout 可以不指定，但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20880"
    @Reference(check = false)
    private ConsumerService consumerService;

    @GetMapping("/provider/user/{id}")
    public String getUserById(@PathVariable int id){
        return consumerService.getUserById(id);
    }

}
