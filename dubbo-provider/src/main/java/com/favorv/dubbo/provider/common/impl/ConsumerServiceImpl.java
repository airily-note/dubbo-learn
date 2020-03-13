package com.favorv.dubbo.provider.common.impl;

import com.favorv.dubbo.common.ConsumerService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * 消费者接口实现
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
@Service(version = "1.0.0", timeout = 10000, interfaceClass = ConsumerService.class)
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String getUserById(int id) {
        if(id == 1) {
            return "消费者调用生产者接口服务1";
        }else {
            return "消费者调用生产者接口服务2";
        }
    }
}
