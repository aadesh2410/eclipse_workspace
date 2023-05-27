package com.test;

//creating thread using extends
public class ThreadDemo extends Thread {

	// method run() is overriding
	// run() performs thread actions
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		ThreadDemo threadDemo = new ThreadDemo();

		// start the execution of thread
		// internally call run method
		threadDemo.start();
	}

}
