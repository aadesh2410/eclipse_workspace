package com.synchronization;

public class TableThread1 extends Thread {

	Table table;
	public TableThread1(Table t) {
		this.table = t;
	}
	
	public void run() {
		table.getTable(5);
	}
}
