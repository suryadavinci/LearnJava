package com.suryatechsources.oops.parent;

import java.io.PrintStream;

public  class Parent {
	
int x=5;	
	
	//public abstract String getName();
	
	 public void foo()
	 {
		 
		 System.out.println("parent");
	 }
	 
	 
	  Parent() 
	 {
		//this(); 
		// throw new Exception();
	 }
	 
	  
	public static void main(String[] args) throws Exception {
		
		
		
	
		Parent p= new Parent() ;
		Parent q=new Parent() ;
		
		
		
		System.out.println(p);
		System.out.println(q);
		
		
		p.x=10;
		q.x=20;
		
		System.out.println(p);
		System.out.println(q);
		
		
		System.out.println(p.x);
		System.out.println(q.x);
		
		Integer x=new Integer(5);
		Integer y=x;
		
		
		y=10;
		
		System.out.println(x+" "+y);
		
	}
	
	
	
	 
}
