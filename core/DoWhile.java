package com.infinite.core;
//Program to check DoWhile loop
public class DoWhile {

	public static void main(String[] args) {

		int a = 30;
		do {					//Using do 
			if (a == 4) {		
				break;			//breaks the loop if the condition is true
			}
			System.out.print(a+" ");
			a--;
		} while (a >= 0);		//runs the loop until the condition is no longer true
	}
}
