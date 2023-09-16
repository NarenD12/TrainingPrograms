package com.infinite.core;
//Program to check how Overriding works	

class OverrideA			//Parent Class
	{
		public void Display()
		{
			System.out.println("A");
		}
	}
	
	class OverrideB extends OverrideA		//1st Child Class extending the Parent Class
	{
		public void Display()
		{
			super.Display();				//Using super keyword to call the parent class function
			System.out.println("B");		
		}
	}
public class OverridingExample {			//Class to check which function gets called first 
	
	public static void main(String[] args) {
		OverrideB obj = new OverrideB();
		obj.Display();				//Using a object to call the Display function from child class	
	}
}
