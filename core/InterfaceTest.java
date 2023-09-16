package com.infinite.core;

import com.infinite.interfaceimpl.Ecommerceimpl;
//Calling a method from impl class with help of object
public class InterfaceTest extends Ecommerceimpl{
	
	public static void main(String[] args) {		
	Ecommerceimpl obj = new Ecommerceimpl();
	obj.samsungmob();
	}
}
