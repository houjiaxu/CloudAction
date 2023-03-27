package com.heal.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p> SayHelloController </p>
 *
 * @author by jiaxu
 * @Classname SayHelloController
 * @Date 2023/3/27 10:57
 */
@RestController
@RequestMapping("/say")
public class SayHelloController {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;

	//http://localhost:9000/say/goods/2
	@GetMapping("/goods/{id}")
	public String findGoodsById(@PathVariable("id") int id){
		System.out.println("findGoodsById..."+id);
        /*
            动态从Eureka Server 中获取 provider 的 ip 和端口
             1. 注入 DiscoveryClient 对象.激活
             2. 调用方法
         */

		//EUREKA-PROVIDER 是服务提供者的appName的大写,这是Eureka默认转换的大写; spring.application.name: eureka-provider
		List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-PROVIDER");

		//判断集合是否有数据
		if(instances == null || instances.size() == 0){
			//集合没有数据
			return null;
		}

		ServiceInstance instance = instances.get(0);
		String host = instance.getHost();//获取ip
		int port = instance.getPort();//获取端口

		System.out.println("host="+host+"  port="+port);

		String url = "http://"+host+":"+port+"/goods/findOne/"+id;
		// 3. 调用方法
//		Goods goods = restTemplate.getForObject(url, Goods.class);
		String goods = restTemplate.getForObject(url, String.class);
		return goods;
	}
}