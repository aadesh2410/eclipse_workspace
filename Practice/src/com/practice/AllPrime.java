package com.practice;

//Print total number of prime numbers between 2 and the given number ( including them ).
public class AllPrime {

	public void display(int k) {
		// Add your code here.
		int resultCount = 0;
		for (int i = 2; i <= k; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				resultCount++;
			}
		}
		System.out.println(resultCount);
	}

	public static void main(String[] args) {
		AllPrime test = new AllPrime();
		test.display(30);
	}
}
