package com.scan;

import java.util.Scanner;

public class ScannerTest {
	public static void getTable(int x) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(x * i);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		scanner.close();
		//MainClass m1 = new MainClass();
		getTable(number);
		
	}

}
