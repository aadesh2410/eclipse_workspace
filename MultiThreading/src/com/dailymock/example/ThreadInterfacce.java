package com.dailymock.example;

public class ThreadInterfacce implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		ThreadInterfacce tInterfacce = new ThreadInterfacce();
		Thread thread = new Thread(tInterfacce);
		thread.start();
		
		
	}

}
