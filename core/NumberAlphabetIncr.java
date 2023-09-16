package com.infinite.core;

//Printing from 1a 2b 3c to 26z
public class NumberAlphabetIncr {
	public static void main(String args[]) {

		int i = 1; // Initialization of i
		int j = 97; // Initialization of j as ASCII number of a
		while (j <= 122) { // While Loop until ASCII number of z
			System.out.print(i + "" + (char) j + " "); //Printing of 1a 2b ....
			i++;
			j++;
		}
	}
}
