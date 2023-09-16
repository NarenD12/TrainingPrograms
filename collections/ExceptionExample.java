package com.infinite.collections;
//Program to check try,catch,finally in exception handling
public class ExceptionExample {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	try									//Writing our code inside the try block
	{
		int a=1/0;
	}
	catch (Exception e)					//Catch Block gets called if there is a error in the try block
	{
		System.out.println(e);
		}
	finally								//Finally block to print anything even if there is a exception
	{
		System.out.println(".....");
		}
	}
}
