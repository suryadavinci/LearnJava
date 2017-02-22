package com.suryatechsources.thread;

public class MyThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void run() {

		int x = 0;
		for (int i = 0; i < 333; i++) {
			x++;

			System.out.println(x + " " + Thread.currentThread().getName() + " is Running in MyThread");
		}

	}

	public void run(String s) {
		System.out.println("String in run is " + s);
	}

}
