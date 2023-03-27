package com.heal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p> EurekaApp </p>
 *
 * @author by jiaxu
 * @Classname EurekaApp
 * @Date 2023/3/27 11:16
 */
@SpringBootApplication
// 启用EurekaServer
@EnableEurekaServer
public class EurekaApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApp.class,args);
	}

}