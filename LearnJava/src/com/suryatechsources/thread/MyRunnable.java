package com.suryatechsources.thread;

public class MyRunnable implements Runnable {

	private static long x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());

		MyRunnable r = new MyRunnable();

		Thread s = new Thread(r);
		MyThread t = new MyThread();
		Thread u = new Thread(r);

		t.setName("Thanu");

		s.setName("Swathi");
		u.setName("Ubay");

		t.start();
		s.start();
		u.start();

	}

	public void run() {
		int x = 0;
		for (int i = 0; i < 333; i++) {
			x++;

			System.out.println(x + " " + Thread.currentThread().getName() + " is Running in MyRunnable");
		}
	}

}
