package com.practice;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		System.out.println("Enter Value");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int count = 0;
		if (number != 0 && number != 1) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Entered value " + number + " is a prime number");
			} else {
				System.out.println("Entered value " + number + " is not a prime number");
			}
		}else {
			System.out.println("Invalid Input");
		}
	}
}
