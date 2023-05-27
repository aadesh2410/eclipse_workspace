package com.test;

public class ThreadDemo2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo2 test = new ThreadDemo2();
		
		
		//to access start method, create object ofThread class
		//pass on this particular class object to Thread constructor
		Thread thread = new Thread(test);
		thread.start();
	}
}
