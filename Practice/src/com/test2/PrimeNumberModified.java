package com.test2;

import java.util.Scanner;

//find the nth prime number. create a separate method and also make user input through scanner.
// input = 5		output = 11 (2,3,5,7,11)
// input = 7 		output = 17 (2,3,5,7,11,13,17)
public class PrimeNumberModified {

	public int checkPrime(int number) { // 2

		int flag = 1;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			return number;
		} else {
			return 0;
		}
	}

	public int nthPrimeNumber(int num) {

		int i = 2;
		while (num != 0) {
			int result = checkPrime(i);
			if (result != 0) {
				num--;
			}
			i++;
		}
		return i - 1;
	}

	public static void main(String[] args) {

		PrimeNumberModified pNumberModified = new PrimeNumberModified();
		System.out.println("Enter the value of N, for which nth prime number is to be found");
		int num = new Scanner(System.in).nextInt();
		System.out.println(num + "th prime number is >> " + pNumberModified.nthPrimeNumber(num));

	}
}
