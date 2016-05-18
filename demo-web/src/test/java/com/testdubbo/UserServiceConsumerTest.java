package com.testdubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testdubbo.service.UserService;

public class UserServiceConsumerTest {

	public static void login(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		context.start();
		UserService service = (UserService) context.getBean("demoService");
		System.out.println("service = "+service.login("test", "test"));
	}
	
	public static void main(String[] args) {
		System.out.println("logi……………………");
		login();
		
	}
}
