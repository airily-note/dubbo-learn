package com.favorv.dubbo.provider.common.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.favorv.dubbo.common.UserService;
import org.springframework.stereotype.Component;

/**
 * @author lql
 * @see Component 交给SpringIOC管理
 * @set Service 别导错包是com.alibaba.dubbo.config.annotation.Service
 * <p>
 *     @Service(version = "1.0.0",timeout = 10000,interfaceClass = UserService.class)
 *     version 声明版本
 *     timeout 超时时间
 *     interfaceClass 提供的具体接口
 * </p>
 */
@Component
@Service(timeout = 10000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public String getUserById(int id) {
        if(id == 1) {
            return "SimpleWu";
        }else {
            return "Apache Dubbo";
        }
    }
}
