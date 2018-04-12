package com.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Reference
	private HelloService HelloService;

	@RequestMapping("/test")
	public String hello() {
		System.out.println("00");
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] { "applicationContext.xml" });
//		context.start();
////		RpcContext.getContext().setAttachment(Constants.MONITOR_KEY,"true");
//		
//		HelloService HelloService = (HelloService) context.getBean("helloService");
		HelloService.sayHello("00");
		System.out.println("sayHelloooo");
		return "00";
	}
}
