package com.infinite.core;
//To Count the number of occurrences of the given char in a string
public class CountAlphabets {
	
	public static void main(String[] args) {		
		String a="RetuRns the Index wIthin this strIng of the first OccuRrence"; //Given String

		char m[]=a.toCharArray(); //Function to change String into sequence of char
		int Counti=0;		//Count for i occurrences
		int Countr=0;		//Count for r occurrences
		int Counto=0;		//Count for o occurrences
		int l=a.length();	//Storing the length of String inside l
		int i;
		
		for(i=0;i<l;i++){					//Loop through the whole String 
			if(m[i]=='i' || m[i]=='I'){		//If Statement to check whether i/I char is found while looping
				Counti++;					//If i/I is found then the count increases
			}
			else if(m[i]=='r' || m[i]=='R'){	//To check whether r/R char is found while looping 
				Countr++;						
			}
			else if(m[i]=='o' || m[i]=='O'){	//To check whether o/O char is found while looping
				Counto++;						
			}
		}						
		System.out.println("Number of occurences of i = "+Counti);	// Printing the Number of Occurrences of char 
		System.out.println("Number of occurences of r = "+Countr);	
		System.out.println("Number of occurences of o = "+Counto);
	}
}

