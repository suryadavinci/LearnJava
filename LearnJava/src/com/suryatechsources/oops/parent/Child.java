package com.suryatechsources.oops.parent;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.suryatechsources.oops.parent.Parent;

public class Child extends Parent {
	
	 public void foo()
	 {
		 
		 System.out.println("child");
	 }
	
	 
	 
	 public static void main(String arg[])
	 {
		 
		 Parent p = new Child();
		 Child c= (Child) p;
		 
		 p.foo();
		 c.foo();
		 
		 
		 
	 }
	
}
