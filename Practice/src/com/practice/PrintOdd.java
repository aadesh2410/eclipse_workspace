package com.practice;

import java.util.Scanner;

public class PrintOdd {
	public static void main(String[] args) {
		System.out.println("Enter Value until which odd are to be printed");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		for(int i = 0; i < number; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
