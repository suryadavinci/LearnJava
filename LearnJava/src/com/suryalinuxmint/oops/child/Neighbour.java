package com.suryalinuxmint.oops.child;

public class Neighbour extends Child {

	
	
	
	public void call()
	{
		System.out.println(this.num);
		//System.out.println(Parent.num);

		
		
	//	Child c =new Child();
		
		
		//System.out.println(c.num);
		
	}
	public static void main(String arg[])
	{
		
		Neighbour neighbour=new Neighbour();
		
		neighbour.call();
		System.out.println(neighbour.num);
	}
	
	
	
}
