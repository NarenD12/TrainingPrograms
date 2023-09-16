package com.infinite.core;
// Program to print a Paragraph with given String
public class BadProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Im a Bad Programmer";  //Given String
		for (int j = 1; j <= 4; j++) {		//Loop to print 4 lines
			for (int i = 1; i < 5; i++) {	//Loop to print the String 4 times
				System.out.print(a);		//Printing the String
			}
			System.out.println();
		}
	}
}
