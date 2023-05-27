package com.synchronization;

public class TableThread2 extends Thread{
	Table table;
	public TableThread2(Table t) {
		this.table = t;
	}
	
	public void run() {
		table.getTable(2);
	}
}
