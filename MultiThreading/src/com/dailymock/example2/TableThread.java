package com.dailymock.example2;

public class TableThread extends Thread {

	int x; // x = 10
	Table table; // table = newTable

	// constructor
	public TableThread(Table t, int value) { // value = y = 10 t = newTable
		this.table = t; // table = newTable
		this.x = value; // x = y = 10 i.e x = 10
	}

	// writing run method
	public void run() {
		System.out.println(Thread.currentThread().getName());
		table.getTable(5); // newtable.getTable();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		Table newTable = new Table();
		int y = 10;

		// newTable.getTable(5);

		// only need to create current class object
		// no need of thread class object
		
		
		//thread1
		TableThread tableThread = new TableThread(newTable, y);
		//thread2
		TableThread tableThread2 = new TableThread(newTable, 50);
		tableThread.setName("First thread");
		tableThread2.setName("Second Thread");
		tableThread.start();
		tableThread2.start();
	}

}
