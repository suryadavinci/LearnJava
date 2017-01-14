package com.suryatechsources;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


class Parent {
	
	static{
		System.out.println("parent static");
	}
	
	{
		System.out.println("parent instance");
	}
	
	Parent(){
		System.out.println("parent cons");
	}
}


class Child extends Parent
{
	static{
		System.out.println("child static");
	}
	{
		System.out.println("child instance");
	}

	Child(){
		System.out.println("child cons");
	}
	
	
	
	
	
}


public class PracticeEverything extends Child{
	
	
	public static void main(String [] args) {

		  	Scanner in = new Scanner(System.in);
	        String time = in.next();
	        
	        int hourOff=0;
	        int hour=0;
	        
	        if(time.contains("PM"))
	            hourOff=12;
	        
	        hour=hourOff+Integer.parseInt(time.substring(0,2));
	        
	        if(hour==24)
	        hour=12;
	        if(time.contains("AM") && time.substring(0,2).equals("12"))
		        hour=0;

	        String hourString=Integer.toString(hour);
	        if(hourString.length()==1)
	        hourString="0"+hourString;
	        
	        System.out.println(hourString+time.substring(2,8));
	        
	        main(null);
	        
		
		
		
		 }
	
/*
	public static void main(String[] args) {

		Runtime rt=Runtime.getRuntime();
		
		System.out.println("Total Memory :"+rt.totalMemory());
		
		
		System.out.println("Free Memory before Date Object Creation :"+rt.freeMemory());
		
		Date d=null;
		
		for(int i=0;i<1000;i++)
		{
			d= new Date();
			d=null;
		}
		
		
		System.out.println("Free Memory after Date Object Creation :"+rt.freeMemory());
		
		
		System.out.println("collecting garbage using Runtime");
		Runtime.getRuntime().gc();


		System.out.println("Free Memory after Garbage Collection :"+rt.freeMemory());
		
		
		
	}*/
	
	

}

