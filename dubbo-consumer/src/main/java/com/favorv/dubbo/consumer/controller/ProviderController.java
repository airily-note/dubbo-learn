package com.favorv.dubbo.consumer.controller;

import com.favorv.dubbo.common.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    //timeout 可以不指定，但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20880"
    @Reference(version = "1.0.0", check = false)
    private ProviderService providerService;

    @GetMapping("/provider/user/{id}")
    public String getUserById(@PathVariable int id){
        return providerService.getUserById(id);
    }

}
