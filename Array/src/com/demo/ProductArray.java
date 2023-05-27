package com.demo;

import java.util.Scanner;

public class ProductArray {

	public int[] getProductOfArray(int[] array1, int[] array2) {

		int[] productArray = new int[array1.length];
		for (int i = 0; i < productArray.length; i++) {
			productArray[i] = array1[i] * array2[i];
		}

		return productArray;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array 1");
		int sArray1 = scanner.nextInt();
		int array1[] = new int[sArray1];
		System.out.println("Enter the size of Array 2");
		int sArray2 = scanner.nextInt();
		int array2[] = new int[sArray2];

		// initializing array1
		System.out.println("Enter the elements of Array 1");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = scanner.nextInt();
		}

		// initializing array2
		System.out.println("Enter the elements of Array 2");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = scanner.nextInt();
		}

		// calling the method
		ProductArray demo = new ProductArray();
		//if size1 != size2, exception will be thrown.
		try {
			int resultantArray[] = demo.getProductOfArray(array1, array2);
			// printing resultant array values
			System.out.println("Product Array values are as follows");
			for (int i = 0; i < resultantArray.length; i++) {
				System.out.print(resultantArray[i] + "	");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		scanner.close();
		
	}
}
