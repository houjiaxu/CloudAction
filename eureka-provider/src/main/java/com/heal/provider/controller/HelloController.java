package com.heal.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> hello </p>
 *
 * @author by jiaxu
 * @Classname HelloController
 * @Date 2023/3/27 10:48
 */
@RestController
@RequestMapping("/goods")
public class HelloController {

	@GetMapping("/findOne/{id}")
	public String findOne(@PathVariable("id") int id){

		return "找到了id="+id+"的数据";
	}
}