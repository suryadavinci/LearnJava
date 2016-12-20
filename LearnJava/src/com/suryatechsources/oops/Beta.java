package com.suryatechsources.oops;

import java.util.Calendar;
import java.util.Date;


class Alpha{
	
	Alpha(){
		
		this.num1=5;
		
	}
	
	
	public static int num1=0;
	public void foo()
	{
		System.out.println("Alpha");
	}
	
	public static  void  setNum(int num)
	{
		Alpha.num1=num;
	}
	
	
	
}

public class Beta extends Alpha implements Runnable{
	
	public void foo()
	{
		System.out.println("Beta");
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void x(String... x)
	{
		System.out.println("String...");
	}
	
	public static Object x(String x)
	{
		System.out.println("String");
		int x1=0;
		
		
		Object obj=new Object();
		obj=(Object) x1;
		
		return x1;
	}
	
	
	public static void main(String[] args) {

	    
	   
		
		int a[]= new int[5];
		
		
		
	    
	    
	    
	}
	
	
	
 
}
