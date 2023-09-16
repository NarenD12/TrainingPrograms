package com.infinite.collections;
//Program to use addAll method 
import java.util.ArrayList;
import java.util.Collections;



public class AddAllCollections {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();		//Initializing the ArrayList
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("d");
		
		System.out.println("Before addAll : "+a1);
		Collections.addAll(a1, "1","2","3");		//addAll is a method in collections
		System.out.println("After addAll : "+a1);	//Adds all the given value to the end of a known collection/ArrayList

	}

}
