package com.suryatechsources.innerclasses;

class NotParentClass {

	class InnerClass {

	}
}

class InnerClass {
	static int a = 0;
}

public class ParentClass {

	static class InnerClass {
		public static int a;
	}

	public static void main(String[] args) {
		InnerClass.a = 5;

		System.out.println();
	}

}
