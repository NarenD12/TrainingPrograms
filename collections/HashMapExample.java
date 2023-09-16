package com.infinite.collections;
//Program to add elements into a HashMap
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,Object> mp=new HashMap<>();		//Giving the data type of both the key and value in the parameters
		
		mp.put(1, "Naren");				//Assigning a Key number and adding a value
		mp.put(2, "Naren");
		mp.put(3, "Infinite");
		mp.put(4, "Ram");
		mp.put(5, "John");
		
		System.out.println(mp);			//Printing the HashMap
	}
}
