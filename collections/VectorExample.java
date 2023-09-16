package com.infinite.collections;

import java.util.Iterator;
import java.util.Vector;
//Vector program to add,remove,print all elements existing inside the vector
public class VectorExample {
	
	public static void main(String[] args) {
		Vector<Object> ls=new Vector<>();		//Initialize Vector with Object in the parameter (Accepts element of any data type)
		ls.add(34);								//Adding elements into the ArrayList
		ls.add("Naren");
		ls.add(33.23f);
		for(int a=89;a<200;a++){
			ls.add(a);
		}
		System.out.println(ls);
		System.out.println("Size "+ls.size());		//Print the size of Vector
		System.out.println(ls.get(3));				//Get the element in the 3rd position, index starts from 0
		System.out.println("Removed this -"+ ls.remove(2));	//Remove the element in the 2nd position, index starts from 0
		System.out.println("After remove - "+ls);
		
		Iterator<Object> it=ls.iterator();			//Using iterator to print all the values inside the Vector 
		while(it.hasNext()){
			System.out.print(it.next()+" ");
	}

}
}
