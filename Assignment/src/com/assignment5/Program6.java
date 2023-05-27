package com.assignment5;

public class Program6 {
	public void checkGreaterThan100(int x) {
		if(x > 100) {
			System.out.println("Entered number " + x + " is greater than 100");
		}
		else {
			System.out.println("Entered number " + x + " is less than 100");
		}
	}
	public static void main(String[] args) {
		int temp = 0;
		Program6 test = new Program6();
		test.checkGreaterThan100(temp);
	}
}
