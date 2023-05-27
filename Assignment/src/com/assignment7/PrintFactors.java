package com.assignment7;

import java.util.Scanner;

//Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.

public class PrintFactors {

	public void printFactors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + "  ");
			}
		}
	}

	public static void main(String[] args) {
		PrintFactors program3 = new PrintFactors();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for getting its factors");
		int num = scanner.nextInt();
		System.out.println("Factors of "+num+" are as follows>>");
		program3.printFactors(num);
		scanner.close();
	}
}
