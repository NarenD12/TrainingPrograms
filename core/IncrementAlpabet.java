package com.infinite.core;
// Printing from A to k with only A being capital
public class IncrementAlpabet {

	public static void main(String args[]) {
		char j = 'A';
		char i = 'b';
		System.out.print(j + " ");	//Printing A first
		while (i <= 'k') {			//Running the loop from b to k
			System.out.print(i + " ");
			i++;
		}
	}
}
