package com.infinite.core;

//@Naren
//Swapping of 2 numbers without 3rd Variable
public class SwapExample {

	public static void main(String[] args) {
		int a = 190;
		int b = 90;
		System.out.println("Value of a before swap " + a);
		System.out.println("Value of b before swap " + b);

		b = (a + b) - (a = b);			//One Method to swap without 3rd variable

		System.out.println("The value of a after swap " + a);
		System.out.println("The value of b after swap " + b);
	}
}
