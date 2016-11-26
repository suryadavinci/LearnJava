package com.suryalinuxmint.oops;


//cannot calla constructor as a normal method.

public class Hello {
String title;
int value;
public Hello() {title += " World";}

public Hello(int value) {
this.value = value;
title = "Hello";
//com.suryalinuxmint.oops.Hello.Hello();
Hello();
}

public void Hello() {
	// TODO Auto-generated method stub
	
}


}

