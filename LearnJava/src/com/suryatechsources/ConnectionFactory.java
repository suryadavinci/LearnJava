package com.suryatechsources;

public class ConnectionFactory {
	
	private static ConnectionFactory cf= new ConnectionFactory();
	
	
	{
		System.out.println("instance initialisation");
	}
	
	
	
	
	static{
		System.out.println("static initialisation");
	}
	
	
	
	public ConnectionFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("New Instance Created");
	}
	
	public static void getConnection(){
		System.out.println("Inside GetConnection");
	}

}
