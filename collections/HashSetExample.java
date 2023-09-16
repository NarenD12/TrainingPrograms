package com.infinite.collections;
import java.util.HashSet;
//Programs for adding values into a HashSet
public class HashSetExample {
	
	public static void main(String[] args) {
		HashSet<Object> ls=new HashSet<>();			//Using object in the parameter to accept any data types of elements
		ls.add(34);
		ls.add("Naren");
		ls.add("Infinite");
		ls.add(33.23f);
		
		System.out.print(ls);		//Printing the HashSet, It maintains an order 
	}
}