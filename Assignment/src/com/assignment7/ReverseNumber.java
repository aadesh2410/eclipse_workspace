package com.assignment7;

import java.util.Scanner;

//Design method public int getReverseNumber(int num) which return
//int value to that method and result print into main method.

public class ReverseNumber {

	public int getReverseNumber(int num) {
		int count = 0, reverse_num = 0;
		int copy_num = num;

		// loop for knowing the number of digits
		while ((num / 10) != 0) {
			num = num / 10;
			count++;
		}
		// count is set
		// loop for reversing the number
		while ((copy_num / 10) != 0) {
			int remainder = copy_num % 10;
			copy_num = copy_num / 10;
			reverse_num = (int) (remainder * Math.pow(10, count) + reverse_num);
			count--;
		}
		return reverse_num + num;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReverseNumber program4 = new ReverseNumber();
		System.out.println("Enter number you want to get reversed");
		int temp = scanner.nextInt();
		System.out.println("Enterted number " + temp + " after reversing is >> " + program4.getReverseNumber(temp));
		scanner.close();
	}
}
