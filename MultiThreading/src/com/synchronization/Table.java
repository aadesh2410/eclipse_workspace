package com.synchronization;

public class Table {

	
	public void getTable(int num) {

		// synchronized block
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num * i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
