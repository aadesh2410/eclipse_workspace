package com.assignment10;

import java.util.Scanner;

//1. Write Java program to check whether number is prime or not. ( Prime means  a number which 
//is divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number,
//it is not a prime number.)

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter Value");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int count = 0;
		if (number > 1) {
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
			System.out.println("Neither prime nor consecutive or INVALID input");
		}
	}

}
