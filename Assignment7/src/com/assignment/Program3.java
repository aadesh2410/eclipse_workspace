package com.assignment;

import java.util.Scanner;

//Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.

public class Program3 {

	public void printFactors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + "  ");
			}
		}
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for getting its factors");
		int num = scanner.nextInt();
		System.out.println("Factors of "+num+" are as follows>>");
		program3.printFactors(num);
		scanner.close();
	}
}
