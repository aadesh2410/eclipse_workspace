package com.practice;

import java.util.Scanner;

public class PrintPrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter Value until which prime numbers are to be printed");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		if (number != 0 && number != 1) {
			for (int i = 0; i < number; i++) {
				int count = 0;

				for (int j = 1; j <= number; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.print(i + " ");
					// System.out.println("Entered value " + number + " is a prime number");
				}
				
				//else {
					//System.out.println("Entered value " + number + " is not a prime number");
				//}
			}

		} else {
			System.out.println("Invalid Input");
		}
	}
}
