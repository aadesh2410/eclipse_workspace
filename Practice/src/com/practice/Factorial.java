package com.practice;

import java.util.Scanner;

public class Factorial {
	public static long getFactorial(long x) {
		int i = 1;
		long result = 1;
		if (x >= 1) {
			for (i = 1; i <= x; i++) {
				result = result * i;
			}
		} else {
			System.out.println("Invalid Input");
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		long number = getFactorial(scan.nextLong());
		System.out.println(number);
		scan.close();
	}
}
