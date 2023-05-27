package com.demo;

public class ArrayInfo {

	public static void main(String[] args) {

		// declaration
		int[] array;
		int[] array1;
		int array2[] = { 1, 2, 3, 4, 5 };

		// declaration and instantiation
		String[] stringArray = new String[5];

		// hard coding array values
		// array literal
		array = new int[] { 1, 2, 3, 4, 5 };
		array1 = new int[] { 6, 7, 8, 9, 10 };

		// initializing the array
		stringArray[0] = "Aadesh";
		stringArray[1] = "Vaibhav";
		stringArray[2] = "Jayesh";
		stringArray[3] = "Samruddhi";
		stringArray[4] = "Nutan";

		// print array values
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i] + "	");
		}

		// For each loop
		// without using index, traversing the array values
		for (String string : stringArray) {
			System.out.println(string);
		}

	}

}
