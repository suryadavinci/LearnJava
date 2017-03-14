package com.suryatechsources;

public class Operators {
	public static void main(String[] args) {
		int x=5;
		
		int y=6;
		//x=00000000000000000000000000000101;5
		//y=00000000000000000000000000000110;6
		//x^y=00000000000000000000000000000011;3
		System.out.println(x^y);
		
		int z=64;
		System.out.println(~z);
		//z=00000000000000000000000001000000;64
		//~z=11111111111111111111111110111111;=-2pow(32)+2pow(31)+....+0*2pow(6)+...+2pow(0)=-65;
		
			
		
		
		
	}
}
