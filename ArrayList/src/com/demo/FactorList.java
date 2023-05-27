package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//return the arraylist of factors
public class FactorList {

	public List<Integer> getFactor(int num) {
		List<Integer> temp = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				temp.add(i);
			} else {
				continue;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FactorList factorList1 = new FactorList();
		// creating arraylist
		List<Integer> factorList = new ArrayList<>();

		// taking user input
		System.out.println("Enter the number");
		int N = scanner.nextInt();

		// calling getfactor method
		factorList = factorList1.getFactor(N);

		// printing the list
		System.out.println("Factors are >>");
		for (Integer integer : factorList) {
			System.out.print(integer + "\t");
		}
	}
}
