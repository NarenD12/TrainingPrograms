package com.infinite.core;
//Print a array 
public class ArrayExample1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= new int[5]; // Syntax no. 1
		int a1[]= new int[5]; // Syntax no. 2
		int [] a2= {11,22,33};// Syntax no. 3
			
		int i=0;
		while(i<3)
		{
			System.out.println(a2[i]);
			i++;
		}
		i=0;
		while(i <a2.length){
			System.out.println(a2[i]);
			i++;
		}
	}
}
