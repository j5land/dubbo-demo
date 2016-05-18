package com.testdubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

	public static void login(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		context.start();
		try {
			Thread.sleep(1000*50L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("finish……………………");
	}
	
	public static void main(String[] args) {
		System.out.println("logi……………………");
		login();
		
	}
}
