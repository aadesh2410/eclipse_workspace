package com.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given two strings a and b consisting of lowercase characters. 
 * The task is to check whether two given strings are an anagram of each other or not. 
 * An anagram of a string is another string that contains the same characters, 
 * only the order of characters can be different. 
 * For example, act and tac are an anagram of each other.
 * 
 */
public class Anagram {

	/*
	 * public static void isAnagram(String x, String y) {
	 * 
	 * String x_new = x.toLowerCase(); String y_new = y.toLowerCase();
	 * 
	 * // char[] xArray = x_new.toCharArray(); // char[] yArray =
	 * y_new.toCharArray();
	 * 
	 * int sumOfX = 0; for (int i = 0; i < x_new.length(); i++) { sumOfX = sumOfX +
	 * x_new.charAt(i); // System.out.println(sumOfX);
	 * 
	 * } int sumOfY = 0; for (int i = 0; i < y_new.length(); i++) { sumOfY = sumOfY
	 * + y_new.charAt(i); // System.out.println(sumOfY);
	 * 
	 * } if (sumOfX == sumOfY) { System.out.println(x + " & " + y +
	 * " are Anagrams"); } else { System.out.println(x + " & " + y +
	 * " are not Anagrams"); } }
	 */
	int flag = 0;

	public void isAnagram(String x, String y) {
		String x_new = x.toLowerCase();
		String y_new = y.toLowerCase();

		char[] xArray = x_new.toCharArray();
		char[] yArray = y_new.toCharArray();

		Arrays.sort(xArray);
		Arrays.sort(yArray);
		if (xArray.length == yArray.length) {
			for (int i = 0; i < xArray.length; i++) {
				if (xArray[i] != yArray[i]) {
					flag = 1;
					break;
				} else {
					flag = 0;
				}
			}
		} else {
			flag = 1;
		}

	}

	public static void main(String[] args) {

		Anagram test = new Anagram();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = scanner.nextLine();
		System.out.println("Enter second string");
		String str2 = scanner.nextLine();
		test.isAnagram(str1, str2);
		if (test.flag == 1) {
			System.out.println("'" + str1 + "'" + " & " + "'" + str2 + "'" + " are not ANAGRAMS");
		} else {
			System.out.println("'" + str1 + "'" + " & " + "'" + str2 + "'" + " are ANAGRAMS");
		}
		scanner.close();
	}
}
