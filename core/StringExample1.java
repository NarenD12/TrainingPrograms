package com.infinite.core;
//Print the string in reverse
public class StringExample1 {

	public static void main(String args[]) {
		String y[] = { "Monday", "Tuesday", "Wednesday", "Thursday" };
		String e = y[2].toUpperCase(); //Converting to UpperCase
		char t[] = e.toCharArray();	//Converting to Character Array
		int p = t.length - 1;	
		while (p >= 0) {
			System.out.print(t[p]);		//Printing the array in reverse
			p--;
		}
	}
}
