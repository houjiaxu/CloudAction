package com.heal.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient // 激活DiscoveryClient
//@EnableEurekaClient //新版本可省略
@SpringBootApplication
public class ConsumerApp {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApp.class,args);
	}
}