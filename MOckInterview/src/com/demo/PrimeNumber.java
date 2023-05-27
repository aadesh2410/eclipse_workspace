package com.demo;

public class PrimeNumber {

	public static String checkPrime(int x) {
		int counter = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				counter++;
			}
		}
		if (counter > 2) {

			return "Not, a prime number";

		} else {
			return "Yes, a prime number";
		}
	}

	public static void main(String[] args) {

		int temp = 13;
		String string_temp = checkPrime(temp);
		System.out.println(string_temp);

	}
}
