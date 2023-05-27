package com.assignment17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Write a Java Program for counting the vowels and numbers from file( abc.txt) .

public class GetVowelNumber {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Example.txt");
		Scanner scanner = new Scanner(fileInputStream);
		int vcount = 0, numcount = 0;
		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			for (int i = 0; i < string.length(); i++) {
				char ch = string.charAt(i);
				if ((ch == 'a' || ch == 69 || ch == 73 || ch == 79 || ch == 85 || ch == 97 || ch == 101 || ch == 105
						|| ch == 111 || ch == 117)) {
					vcount++;
				}
				if (ch >= 48 || ch <= 57) {
					numcount++;

				}
			}

		}
		System.out.println("Vowel count = " + vcount);
		System.out.println("Number count = " + numcount);

	}
}
