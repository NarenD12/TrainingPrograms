package com.infinite.core;
//Program to check if given year is leap year or not
public class LeapYear {
	
	public static void main(String [] args){
		int a= 2023;
		
		if(a%4==0){			//Condition to check if value is leap year
			System.out.println("Is a Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}

}
