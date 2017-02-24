package com.suryatechsources.innerclasses;


class SomeClass{
	
	static class ItsInnerClass{
		static{
			ParentClass.x=5;
		}
		 void hello(){
			System.out.println("hello");
		}
	}
	
}


public class ParentClass {

	static int x=0;
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		System.out.println(x);
		
		Object obj=Class.forName("com.suryatechsources.innerclasses.SomeClass").newInstance();
		
		System.out.println(x);

	}

}
