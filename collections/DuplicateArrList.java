package com.infinite.collections;
//Program to delete duplicate values in a ArrayList
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class DuplicateArrList {
	public static void main(String[] args) {
		ArrayList<Object> d = new ArrayList<>();		//Initialize the ArrayList
		d.add("Naren");						//Adding Values into the ArrayList
		d.add("Naren");
		d.add(1);
		d.add(1);
		d.add("Sam");
		d.add("Sam");
		System.out.println("Before Removing the Duplicates: "+d);			//Printing the ArrayList 
		Set<Object> s = new LinkedHashSet<>(d);			//Using LinkedHashSet to eliminate the Duplicate values & maintain order
		System.out.println("After Removing the Duplicates: "+s);			//Print the set which removes Duplicates by itself

	}

}
