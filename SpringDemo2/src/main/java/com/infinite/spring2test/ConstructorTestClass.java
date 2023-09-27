package com.infinite.spring2test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinite.spring2task.ConstructorInjection;

public class ConstructorTestClass {
 
	public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("sample1.xml");
	ConstructorInjection con = (ConstructorInjection) context.getBean("const");
	System.out.println(con.displayName());
	context.registerShutdownHook();
	}
	
}
