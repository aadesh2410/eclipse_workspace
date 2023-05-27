package com.assignment;

import java.util.Scanner;

//Design method to check whether the character is alphabet, digit and special symbol.

public class Program1 {

	public void checkCharacter(char ch) {
		if (ch >= 48 && ch <= 57) {
			System.out.println("Entered character " + ch + " is an INTEGER");
		} else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			System.out.println("Entered character " + ch + " is an ALPHABET");
		} else {
			System.out.println("Entered character " + ch + " is a SPECIAL SYMBOL");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter any character");
			char temp = scanner.next().charAt(0);

			// char ch = '`';
			Program1 program1 = new Program1();
			program1.checkCharacter(temp);
		}
	}

}
