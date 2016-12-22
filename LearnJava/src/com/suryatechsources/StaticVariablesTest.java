package com.suryatechsources;

public class StaticVariablesTest {

	
	private static int x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		StaticVariablesTest svt= new StaticVariablesTest();
		
		System.out.println(svt.x);
		
		StaticVariablesTest svt1= new StaticVariablesTest();
		
		System.out.println(svt.x);
		
		StaticVariablesTest svt2= new StaticVariablesTest();
		
		System.out.println(svt.x);
		

	}
	
	StaticVariablesTest()
	{
		this.x= x+1;
		
		
	}
	

}
