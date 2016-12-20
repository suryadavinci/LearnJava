package com.suryatechsources;

import java.io.PrintStream;

public class StackOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.in);
		
		System.out.println(System.out);

		
System.out.println();		
		//PrintStream p1= new PrintStream(p);
		
		
		//p.println("Hi");
		
		//first();
	}

	public static void first(){
		second();
	}
	
	public static void second()
	{
		first();
	}
	
}
