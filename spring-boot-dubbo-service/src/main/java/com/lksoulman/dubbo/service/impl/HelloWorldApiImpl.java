package com.lksoulman.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lksoulman.dubbo.api.HelloWorldApi;

@Service(version = "1.0.0")
public class HelloWorldApiImpl implements HelloWorldApi {

	@Override
	public String sayHello() {
		return "Hello world";
	}
}
