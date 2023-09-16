package com.infinite.interfaceimpl;
import com.infinite.interfaces.Ecommerce;

//Implementation of all the initialized methods from the interface
public class Ecommerceimpl implements Ecommerce {
	

	@Override
	public void samsungmob() {
		// TODO Auto-generated method stub
		System.out.println("Samsung");
		
	}

	@Override
	public void joimob() {
		// TODO Auto-generated method stub
		System.out.println("jio");
		
	}

	@Override
	public void lgmob() {
		// TODO Auto-generated method stub
		System.out.println("LG");
	}

	@Override
	public void aplemob() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
	}

}
