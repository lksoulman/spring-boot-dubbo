package com.lksoulman.dubbo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

import com.lksoulman.dubbo.api.HelloWorldApi;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	HelloWorldApi helloWorldApi;

	@Test
	public void test() {
		System.out.println(helloWorldApi.sayHello());
	}
}
