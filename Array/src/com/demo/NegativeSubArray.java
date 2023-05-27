package com.demo;

public class NegativeSubArray {

	static int countArray;

	public static void checkNegativeArray(int x, int y, int arr[]) {
		int sum = 0;

		for (int i = x; i <= y; i++) {
			sum = sum + arr[i];
			System.out.println(sum);
		}
		if (sum < 0)
			countArray++;
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 1, -2, 4, -5, 1 };

		// outer loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				checkNegativeArray(i, j, arr);
			}
		}
		System.out.println("number of neg subarray is >> " + (countArray));
	}
}
