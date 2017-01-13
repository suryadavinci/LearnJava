package com.suryatechsources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Call {
	
	
	
	Call()
	{
		System.out.println("no-arg cons");
	}
	
	Call(int x)
	{
		System.out.println("arg cons");
	}
	
	{
		System.out.println("inst 1");
	}
	static
	{
		
		System.out.println("static 1");
	}

	{
		System.out.println("inst 2");
	}
	static
	{
		
		System.out.println("static 2");
	}
	
	public static void main(String[] args) throws IOException {
		
		new Call();
		new Call(7);
		
		
		
		
		
		
	}
	
}

