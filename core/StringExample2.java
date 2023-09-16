package com.infinite.core;
//Checking the String Predefined Functions
public class StringExample2 {

	public static void main(String[] args){
		
		String a= "INFINITE     ";
		String b= "infinite";
		String c="";
		String d="iNFInite";
		
		System.out.println(a.length());				//gives Length of string including the blank spaces
		String u=a.trim();							//Stores the string without the blank spaces
		System.out.println(u.length());				
		System.out.println(u.substring(0,3));		//Substring print the string from 0 but before 3, doesn't print the 3rd char 
		System.out.println(u.equals(b.toUpperCase()));//Converts b string to UpperCase and Equals check if the String are similar
		System.out.println(a.indexOf('F'));			//Gives the index number of F
		System.out.println(c.isEmpty());			//Checks if the String is empty or not
		System.out.println(a.lastIndexOf('I'));		//Checks the last instance of I, prints the index number of that
		System.out.println(b.equalsIgnoreCase(d));	//checks if string as similar regardless of the Upper or Lower Case
		System.out.println(b.concat(d));			//adds d String to the end of b String
		System.out.println(d.endsWith("e"));		//Checks if the string ends with 'e'
		System.out.println(a.hashCode());			//gets the HashCode of String a
		System.out.println(d.replaceAll("F","t"));	//Replaces the all instances of F with t
	}
}