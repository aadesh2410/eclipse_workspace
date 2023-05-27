package com.demo;

import java.util.Scanner;

//1.Declare an array
//2. initialize using scanner
//3. print that array
//4. print sum of all the elements of the array using a getSumArray method whose return type is an integer
public class SumArray {

	public static int getSumArray(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			// System.out.println(sum);
		}

		return sum;
	}

	public static void checkEvenArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + "	");
			}
		}
	}

	public static void main(String[] args) {

		// array declaration and instantiation
		int intArray[] = new int[10];

		// initialize the array by taking user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 element for the array");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}

		// print the initialized array
		System.out.println("The entered array elements are >>");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "	");

		}

		// System.out.println(intArray.toString());

		int result = getSumArray(intArray);
		System.out.println();
		System.out.println("The sum of array is " + result);

		System.out.println("List of even numbers inside the array are >>");
		checkEvenArray(intArray);
		scanner.close();
	}
}
