package com.dailymock.example2;

//printing a table for a particular number
public class Table {

	void getTable(int num) {
		
		//use of synchronized block
		synchronized (this) {

			// logic for getting a table
			for (int i = 1; i <= 10; i++) {
				System.out.println("Table >>" + " of " + num);
				System.out.println(num + " * " + i + " = " + num * i);
			}

		}
	}

}
