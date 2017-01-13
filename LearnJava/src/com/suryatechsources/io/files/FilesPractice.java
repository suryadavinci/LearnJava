package com.suryatechsources.io.files;

import java.io.File;
import java.io.IOException;

public class FilesPractice {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		
		File file =new File("hello");
		
		
		System.out.println(file.exists());
		
		System.out.println(file.createNewFile());
				
		
		System.out.println(file.exists());
		
		
		

	}

}
