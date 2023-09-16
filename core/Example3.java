package com.infinite.core;
//Swapping of 2 Numbers, Display 5 num table, Display all alphabets
public class Example3 {
	
	//Swapping of 2 numbers
	public static void swappingE()
	{
		int a=90; 		
		int b=70;
		System.out.println("Value of a before swap: "+a);
		System.out.println("Value of b before swap: "+b);
		a=a+b-(b=a);					//One way to perform Swapping
		System.out.println("Value of a after swap: "+a);
		System.out.println("Value of b after swap: "+b);
	}
	
	//Display 5 number table
	public static void displaytable(int a)
	{
		int j=0;
		while(j<=10)				//Runs the loop until condition fails
		{
			System.out.print(a+"*"+j+"="+a*j+" ");		//Printing the table with a*j giving the multiplication
			j++;
		}
	}
	
	//Display all the alphabets from A to Z
	public static void displayalphabets()
	{
		char q='A';			//Initializing q as char which has the character A 
		while(q<='Z')		//Loop runs until Condition fails
		{
			System.out.print(q+" ");
			q++;
		}
	}
	
	//Printing all by calling them
	public static void main(String args[])
	{
		System.out.println("Swapping of Numbers");
		swappingE();
		System.out.println("\nDisplay 5 table\n");
		displaytable(5);
		System.out.println("\nDisplay all alphabets\n");
		displayalphabets();
		return;
	}
}
