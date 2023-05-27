package com.assignment5;

public class SwapTwoNumbers {
	// Using temp/third variable
	public static void swapping1(int x, int y) {
		// int temp = 0;
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Value of number 1 after swapping = " + x + "\n" + "Value of number 2 after swapping = " + y);

	}

	// Using two variables
	public static void swapping2(int x, int y) {
		y = x + y;
		x = y - x;
		y = y - x;
		System.out
				.println("Value of number 1 after swapping = " + x + "\n" + "Value of number 2 after swapping = " + y);
	}

	public static void main(String[] args) {
		int num1 = -1;
		int num2 = -1;
		if (num1 != num2) {
			System.out.println("Value of number 1 = " + num1 + "\n" + "Value of number 2 = " + num2);
			swapping2(num1, num2);
			// System.out.println("Value of number 1 after swapping = " + +"\n" + "Value of
			// number 2 after swapping = " + );
		} else {
			System.out.println("Ooopsss!!!! " + " \n" + "Values entered are equal .. cannot be swapped");
		}
	}
}
