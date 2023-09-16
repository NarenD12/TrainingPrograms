package com.infinite.core;
import java.util.Scanner;

class UserException extends Exception{
	void message(){
		System.out.println("Wrong data type entered");
	}
}
public class UserDefinedExceptions {
	public static void main(String[] args) {
		try{
//			Scanner s=new Scanner(System.in);
//			int age=s.nextInt();
//			System.out.println("The age is: "+age);
//			s.close();	
			throw new UserException();
		}
		catch(UserException a)
		{
			a.message();
		}
	}
}
