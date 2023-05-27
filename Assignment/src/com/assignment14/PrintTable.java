package com.assignment14;

import java.util.Scanner;

//1.Write a java program to print the all multiplication table from * 2, 3, 4.... to 20.

public class PrintTable {

	public void getTable(int x) {
		System.out.println("Table of " + x + ": ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " * " + i + " = " + x * i);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number upto which tables are required");
		int num = scanner.nextInt();
		PrintTable pTable = new PrintTable();

		// logic is to use nested for loop
		if (num <= 1) {
			System.out.println("invalid input");
		} else {
			for (int i = 2; i <= num; i++) {
				pTable.getTable(i);
			}
		}
		scanner.close();
	}
}
