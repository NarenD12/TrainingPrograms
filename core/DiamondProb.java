package com.infinite.core;
//Program for the solution to the Diamond Problem

interface a		//Using Interfaces instead of Classes 
{
	public default void display()
	{
		System.out.println("Display of Interface a is called");
	}
}
interface b
{
	public default void display()
	{
		System.out.println("Display of interface b is called");
	}
}
public class DiamondProb implements a,b 		//Child class implements to 2 parent Interfaces
{
	public void display()
	{
		a.super.display();				//Using super keyword to call the display function from both interfaces
		b.super.display();
	}
	public static void main(String[] args) {
		
		DiamondProb obj = new DiamondProb();
		obj.display();
	}
}
