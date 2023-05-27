package com.assignment18;

import java.util.Arrays;
import java.util.Scanner;

//Suppose you have array that containing elements 10,20,30,10, 30,50,60.
//Find out duplicate elements into array and print it

public class DuplicateArrayElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array size");
		int N = scanner.nextInt();
		int array[] = new int[N];
		
		//adding array elements
		for(int i = 0; i < N;i++) {
			array[i] = scanner.nextInt();
		}
		
		
		//sorting
		Arrays.sort(array);
		int count = 0;
		//core logic
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				System.out.println("Duplicate of " + array[i] + " found");
				count++;
			}
		}
		System.out.println("in total "+ count+" duplicates found");

	}
}
