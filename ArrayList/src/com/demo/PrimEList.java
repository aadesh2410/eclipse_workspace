package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//return the count of prime nos in a arraylist
public class PrimEList {

	// int flag;
	int finalCount;

	public void primeCheck(int x) {
		// int count = 0;
		// System.out.println(x);
		boolean flag = false;
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0) {
				flag = true;
				break;
			} else {
				continue;
			}
		}
		// System.out.println(count);
		if (!flag) {
			finalCount++;
		}
	}

	public static void main(String[] args) {

		PrimEList pList = new PrimEList();
		Scanner scanner = new Scanner(System.in);
		// creating arraylist
		List<Integer> primeList = new ArrayList<>();

		// taking user input
		System.out.println("Enter the size of the list");
		int N = scanner.nextInt();
		System.out.println("Enter the list elements");
		for (int i = 0; i < N; i++) {
			primeList.add(scanner.nextInt());
		}

		// traversing the list and using primecheck method
		
		for (int i = 0; i < N; i++) {
			// System.out.println(primeList.get(i));
			pList.primeCheck(primeList.get(i));
			
		}
		System.out.println("Prime number count = " + pList.finalCount);
	}
}
