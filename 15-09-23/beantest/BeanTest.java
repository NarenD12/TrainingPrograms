package com.infinite.beantest;

import java.util.Date;

import com.infinite.beans.User;

public class BeanTest {
	public static void main(String[] args) {
		
	User naren=new User();
	
	naren.setUsername("Naren");
	naren.setPassword("DN");
	naren.setLogindate(new Date());
	naren.display();
	System.out.println(naren.getUsername());
	}
}
