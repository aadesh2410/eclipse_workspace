package com.assignment18;

import java.util.Scanner;

/*
 * 1. Suppose You have given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. 
 * You need to provide optimum solution to find the missing number. 
 * Number can not be repeated in the array.
 */
public class MissingArrayElement {

	
	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter array size");
		//int N = scanner.nextInt();
		int[] array = new int[] {1,2,3,5,6,7,8,9};
		
		//adding elements
//		int i =0, sum = 0;
//		while(scanner.hasNextInt()) {
//			array[i] = scanner.nextInt();
//		}
		int sum = 0;
		for(int j = 0; j < array.length;j++) {
			sum = sum + array[j];
		}
		//System.out.println(sum);
		int arraySize = array.length + 1;
		//System.out.println(arraySize);
		int sum1 = (arraySize * (arraySize + 1) )/ 2;
		//System.out.println(sum1);
		int missingElement = sum1 - sum;
		//System.out.println(array);
		System.out.println("Missing element >>" + missingElement);
		
	}
}
