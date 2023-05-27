package com.assignment6;

import java.util.Scanner;

// Design method int fact orial(int no)  which returns int value to that method. print the results 
//into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)

public class Program4 {
	public int getFactorial(int x) {
		int result = 1;
		if (x == 0) {
			return result = 1;
		} else {

			for (int i = 1; i <= x; i++) {
				result = result * i;
			}
			// System.out.println(result);
			return result;
		}
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number whose factorial is required");
		int temp = scanner.nextInt();
		if (temp < 0) {
			System.out.println("Invalid input >>> Factorial of negative number is not possible");
		} else {

			System.out.println("Value of " + temp + "! = " + program4.getFactorial(temp));
		}

		scanner.close();
	}
}
