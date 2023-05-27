package com.string;

import java.util.Scanner;

public class PalindromeString {

	public void isPalindrome(String str) {
		int j = str.length() - 1;

		// System.out.println(j);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(j)) {
				j--;
				// System.out.println(j);
				flag = 1;
			} else {
				flag = 0;
				break;
			}

		}
	}

	int flag = 0;

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String tempStr = scanner.nextLine();
		palindromeString.isPalindrome(tempStr);
		if (palindromeString.flag == 1) {
			System.out.println("Entered string '" + tempStr + "' is a Palindrome string");
		} else {
			System.out.println("Entered string '" + tempStr + "' is not a Palindrome string");
		}
		scanner.close();
	}
}
