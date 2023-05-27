package com.assignment10;

import java.util.Scanner;

/*
 2. Write a java program to display the Fibonacci series up to given number. 
 (Fibonacci series mean next number is the sum of previous two numbers for example 0,1,1,2,3,5,8,13,21,34,55 etc. 
 If enter no as 5 then output is 0,1,1,2,3).
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		int previous = 0;
		int next = 1;
		System.out.println("Enter number until which fibonacci numbers are needed");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number >= 1) {
			System.out.println("Fibonacci series upto "+number+" is >>");
			System.out.println(previous);
			System.out.println(next);			
			while (next <= number) { // 0<=25 //1<=25 //2<=25

				int temp = previous + next; // 1 2
				previous = next;
				next = temp; // 1 2

				if (next > number) {
					break;
				} else {
					
					System.out.println(next);
					continue;
				}

			}
		}else {
			System.out.println("INVALID INPUT");
		}
		scanner.close();
	}
}
