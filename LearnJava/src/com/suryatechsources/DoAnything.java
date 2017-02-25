package com.suryatechsources;

public class DoAnything {
	
	boolean quit;
	static int count=0;
	public static void main(String[] args) {


		DoAnything qr = new DoAnything();
	    


	    System.out.println(
	        "JMS Ready To Receive Messages (To quit, send a \"quit\" message).");

	    // Wait until a "quit" message has been received.
	    synchronized(qr) {
	     while (! qr.quit) {
	       try {
	         qr.wait();
	       } catch (InterruptedException ie) {}
	     }
	    }
		
		
	}

}
