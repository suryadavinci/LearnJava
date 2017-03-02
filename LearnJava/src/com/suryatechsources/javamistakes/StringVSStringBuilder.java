package com.suryatechsources.javamistakes;

public class StringVSStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x= "hello";
		
		
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
			x=x+"hello";
		
		long now=System.currentTimeMillis();
		System.out.println("Time Taken by String "+(now-start));
		
		StringBuilder y= new StringBuilder("hello");
		
		for(int j=0;j<100000;j++)
			y.append("hello");
		
		System.out.println("Time Taken by StringBuilder "+(System.currentTimeMillis()-now));
		
		
	}

}
