package com.infinite.core;
//Program for working of Constructors in Multi-Level Inheritance	
	
	
	class ab  		//Parent Class 
	{
		public ab()		//Empty Constructor
		{
			System.out.println("Constructor in ab is called");
		}
	}
	
	class bc extends ab 	//1st Child Class extending the parent class
	{
		public bc()			//Empty Constructor
		{
			System.out.println("Constructor in bc is called");
		}
	}
	
	class ConstMultiInher extends bc		//Lowest Child Class extending 1st child class
	{
		public ConstMultiInher()			//Empty Constructor
		{
			System.out.println("Constructor in lowest subclass is called");
		}
	}

