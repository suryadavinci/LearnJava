package com.suryatechsources;

import java.util.Arrays;



class NewParent{
	
	Call c;
	NewParent(){
		c= new Call();
	}
	
	
}
public class Call extends NewParent {
	
	
	static NewParent p;
	
	
	
	public static void main(String[] args) {
		System.out.println("hi");
		p=new NewParent();
	}
	
	static int count;
	static int memMax;

	public static void main1(String[] args) {
		
		
		
		int[] a= { 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82 };//{3,4,5,7,3,4,5};//AllUtils.generateRandomIntArray(10, 1, 10);
		System.out.println(Arrays.toString(a));
		
	}

	public static void combinations(String str, String prefix){
		if(str.length()==0){
				System.out.println(prefix);
				return;
			}
		else{
			for(int i=0;i<str.length();i++){
				combinations(str.substring(0,i)+str.substring(i+1),prefix+str.substring(i, i+1));
			}
		}
	}
	
	public static void permutations(String str,String prefix, int k){
		if(k==0){
			System.out.println(++count+" "+prefix);
			return;
		}
		else{
			for(int i=0;i<str.length();i++){
				permutations(str,prefix+""+str.charAt(i), k-1);
			}
		}
	}
	
	}
