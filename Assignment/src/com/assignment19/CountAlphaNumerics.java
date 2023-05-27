package com.assignment19;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
 * Design a method for counting the alphabet, vowels and numbers from String. 
 * Input should be from user into main method and pass that to methods. 
 * And result will print into main method 
 */
public class CountAlphaNumerics {

	public int[] count(String x) {
		int alphaCount = 0, vowelCount = 0, numberCount = 0;
		int result[] = new int[3];
		for (int i = 0; i < x.length(); i++) {
			// counting the vowels
			if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o'
					|| x.charAt(i) == 'u') {
				vowelCount++;
			}
			// counting the numbers
			else if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
				numberCount++;
			}
			// counting the consonents
			else if (!(x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o'
					|| x.charAt(i) == 'u')) {

			} else {
				System.out.println("no consonents, numbers or vowels found in the given string");
			}
		}
		result[0] = alphaCount;
		result[1] = vowelCount;
		result[2] = numberCount;
		return result;
	}

	public static void main(String[] args) {

		CountAlphaNumerics countAlphaNumerics = new CountAlphaNumerics();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		int resultArray[] = countAlphaNumerics.count(scanner.next());
		System.out.println("Consonent count >>" + resultArray[0]);
		System.out.println("Vowel count >>" + resultArray[1]);
		System.out.println("Number count >>" + resultArray[2]);
	}
}
