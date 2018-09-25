package com.lksoulman.dubbo.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lksoulman.dubbo.api.HelloWorldApi;

@RestController
public class WebController {
	
	@Reference(version="1.0.0")
	private HelloWorldApi helloWordApi;

	@RequestMapping(value = "/hello")
	public String hello() {
		return helloWordApi.sayHello();
	}
}
