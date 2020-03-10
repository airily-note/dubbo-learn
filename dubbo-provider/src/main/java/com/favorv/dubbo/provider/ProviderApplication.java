package com.favorv.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.container.Main;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@EnableDubboConfiguration
@DubboComponentScan("com.favorv.dubbo.provider.common.impl")
public class ProviderApplication {

	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProviderApplication.class);
        app.run(args);
        //dubbo Main独立运行，脱离web容器
        Main.main(args);
	}

}
