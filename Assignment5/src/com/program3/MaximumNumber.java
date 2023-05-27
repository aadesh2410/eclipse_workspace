package com.program3;

public class MaximumNumber {
	public static void maxNumber(int x, int y, int z) {

		if (x >= y && x >= z) {
			System.out.println("The maximum of 3 values is " + x);
		} else if (y >= x && y >= z) {
			System.out.println("The maximum of 3 values is " + y);
		} else if (z >= x && z >= y) {
			System.out.println("The maximum of 3 values is " + z);
		} else {
			System.out.println("Entered values are INVALID or equal to each other");
		}
	}

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		maxNumber(num1, num2, num3);
	}
}
