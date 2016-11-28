package com.suryalinuxmint.oops.child;

import com.suryalinuxmint.oops.parent.Parent;

public class Child extends Parent {


	public static void main(String arg[]) {
		
		Child c= new Child();
		System.out.println(c.func());
		
	}
	
	public int func(){
		return this.num;
	}
	
	
	
}
