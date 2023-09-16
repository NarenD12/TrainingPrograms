package com.infinite.collections;
//ArrayList example for adding , removing and printing all elements
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList<Object> ls=new ArrayList<>();			//Initialize ArrayList with Object in the parameter (Accepts element of any data type)
		ls.add(34);								//Adding elements into the ArrayList
		ls.add("Naren");						//Adding elements into the ArrayList
		ls.add(33.23f);
		for(int a=89;a<200;a++){
			ls.add(a);
		}
		System.out.println(ls);
		System.out.println("Size "+ls.size());			//Printing the size of the Array 
		System.out.println(ls.get(3));					//Getting the 3rd element from the element, Index starts from 0
		System.out.println("Removed this -"+ ls.remove(2));		//Removing the 2nd element, Index starts from 0
		System.out.println("After remove - "+ls);	
		
		Iterator<Object> it=ls.iterator();				//Iterator to print the whole ArrayList
		while(it.hasNext()){						//hasNext Checks if any element is left and returns True if there is a element left
			System.out.print(it.next()+" ");
		}
	}
}
