package com.test2;

public class Demo implements Runnable {

	private String name;

	public Demo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			System.out.println(name);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Demo("Worker 1"));
		Thread t2 = new Thread(new Demo("Worker 2"));
		Thread t3 = new Thread(new Demo("Worker 3"));
		Thread t4 = new Thread(new Demo("Worker 4"));
		Thread t5 = new Thread(new Demo("Worker 5"));
		Thread t6 = new Thread(new Demo("Worker 6"));

		t5.start();
		t3.start();
		t1.start();
		t6.start();
		t3.join();
		t2.start();
		t1.join();
		t4.start();
		t2.join();
		t4.join();
		t5.join();
	}

}
