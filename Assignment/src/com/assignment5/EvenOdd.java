package com.assignment5;

public class EvenOdd {

	public void checkEvenOdd(int x) {
		if (x % 2 != 0) {
			System.out.println("Entered value " + x + " is ODD");
		} else {
			System.out.println("Entered value " + x + " is EVEN");
		}
	}

	public static void main(String[] args) {
		int temp = 16;
		EvenOdd evenOdd = new EvenOdd();
		evenOdd.checkEvenOdd(temp);
	}
}
