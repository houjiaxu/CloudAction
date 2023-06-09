package com.heal.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
//@EnableEurekaClient //该注解 在新版本中可以省略
@SpringBootApplication
public class ProviderApp {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApp.class,args);
	}
}