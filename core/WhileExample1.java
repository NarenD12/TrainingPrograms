//package com.infinite.core;
//
//public class WhileExample1 {
//	
//	public static void main(String args[]){
//		
//		int i=1;			//Initialization
//		while(i<=5)			//Condition
//		{		
//			System.out.print(i+"a ");	//Code or Instructions
//			i++;			//Increment or Decrement
//		}
//	}
//}

//package com.infinite.core;
//
//public class WhileExample1 {
//
//	public static void main(String args[]) {
//		int i = 2345;
//		while (i <= 5678) {
//			if (i % 2 == 0) {
//				System.out.println(i + " ");
//			}
//			i++;
//		}
//	}
//}

package com.infinite.core;
//Program for checking usage of while 
public class WhileExample1 {

	public static void main(String args[]) {
		int i = 10;
		while (i <= 90) {
			if (i == 60) {
				i = i + 10;
				continue;			
			}
			System.out.print(i + " ");
			i = i + 10;
		}
	}
}