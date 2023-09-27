package com.infinite.spring2test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinite.spring2task.User;

public class values {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("sample1.xml");

		User address = (User) context.getBean("custAddress2");
		System.out.println(address.getName());
		System.out.println(address.getCity());
		System.out.println(address.getDate());
		context.registerShutdownHook();
	}
}
