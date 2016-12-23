package com.suryatechsources.oops.parent;

import java.io.PrintStream;

class GrandParent{
	
	public GrandParent() {
		// TODO Auto-generated constructor stub
		System.out.println("Noarg GP");
	}
	
	GrandParent(String i)
	{
		
		System.out.println("String GP");
	}
	
	

	
	
	
}


public  class Parent extends GrandParent{
	
	Parent()
	{
		System.out.println("empty Parent");
	}
	 Parent(String x)
	 {
		//this();
		 super("Hello");
		 System.out.println("String Parent");
		 
	 }
	  
	public static void main(String[] args) throws Exception {
		new Parent().whine(new Parent("hello"));;
		
	}
	
	
	//new LinkedList();
	
	void whine(Object o)
	{

	System.out.println("Object");
	
	}
	

	//void whine(Parent p)	{	System.out.println("Parent");	}

	
	
	
	
	 
}
