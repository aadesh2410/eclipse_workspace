package com.test;

public class MultiThreadingDemo extends Thread{
	
	
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				//pause thread execution for giving time in milliseconds
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread());
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		
		//number of threads = number of objects
		MultiThreadingDemo mtd1 = new MultiThreadingDemo();
		MultiThreadingDemo mtd2 = new MultiThreadingDemo();
		mtd1.start();
		mtd2.start();
		System.out.println("Out of thread");
	}
}
