package com.suryatechsources.io.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[] in = new char[50];

		File file = new File("hello");
		System.out.println(file.exists());
		System.out.println(file.createNewFile());

		FileWriter fw = new FileWriter(file);

		fw.write("Hello World");

		fw.flush();

		fw.close();

		FileReader fr = new FileReader(file);

		int size = fr.read(in);

		System.out.print(size + " ");

		for (char c : in)
			System.out.print(c);

		float x = 0;

		fr.close();

	}

}
