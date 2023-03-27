package com.heal.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p> RestTemplateConfig </p>
 *
 * @author by jiaxu
 * @Classname RestTemplateConfig
 * @Date 2023/3/27 10:56
 */
@Configuration
public class RestTemplateConfig {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}