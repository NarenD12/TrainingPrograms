package com.infinite.core;
//Program to Print the each Strings in array in Reverse Order
public class ReverseDay {

	public static void main(String[] args) {
		String y[] = { "Monday", "Tuesday", "Wednesday", "Thursday" }; //The given Array consisting of different strings
		int i = 0;
		int j;
		for (i = 0; i <= y.length - 1; i++) {	//Loop until all 4 Strings in the array are looped through
			String m = y[i];					//storing each string in given array in m as we loop
			int k = m.length();					//storing each string length in k as we loop
				for (j = k - 1; j >= 0; j--) {		//Loop for going through each character in a single string
					char day[] = m.toCharArray(); 	//using Function to change string to sequence of char
					System.out.print(day[j]);		//Printing the reverse of the String
				}
			System.out.println("");
		}
	}
}
