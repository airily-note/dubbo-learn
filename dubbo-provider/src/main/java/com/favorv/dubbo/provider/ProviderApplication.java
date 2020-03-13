package com.favorv.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "com.favorv.dubbo.provider.common.impl")
@DubboComponentScan()
@SpringBootApplication
public class ProviderApplication {

	public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
	}

}
