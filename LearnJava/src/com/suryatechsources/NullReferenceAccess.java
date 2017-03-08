package com.suryatechsources;

public class NullReferenceAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="hello";
		int i=0;
		while(i++<100){
			x=x+x;
			
		}
		
		
		
	}

	public static void nullReference(){
		System.out.println("Accessing");
	}
}
