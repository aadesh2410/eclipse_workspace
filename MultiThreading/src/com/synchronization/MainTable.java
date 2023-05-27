package com.synchronization;

public class MainTable {

	
	public static void main(String[] args) {
		
		Table table = new Table();
		TableThread1 tt1 = new TableThread1(table);
		TableThread2 tt2 = new TableThread2(table);
		tt1.start();
		tt2.start();
		
	}
}
