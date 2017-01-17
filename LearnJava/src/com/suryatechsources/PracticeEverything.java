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


public class PracticeEverything extends Child implements Runnable{
	public static int x=0;
	
	public static void main(String [] args) throws Exception {



		recursion();
		
		
		
		 }
	
	
	
	public static void recursion() throws Exception
	{


		
	}



	public void run() {
		// TODO Auto-generated method stub
		
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

