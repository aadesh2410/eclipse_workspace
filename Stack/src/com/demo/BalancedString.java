package com.demo;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/*
 * A string containing only parentheses is balanced if the following is true: 
 * 1. if it is an empty string 
 * 2. if A and B are correct, AB is correct,
 * 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.




]([}{}))( - (())[]{} - ()[] - () 


 */
public class BalancedString {

	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			Stack<Character> stack = new Stack<>();
			System.out.println("Enter the string");

			// scanning the string
			String string = scanner.next();
			String checkString = "";
			// logic for storing brackets into the stack
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == 123 || string.charAt(i) == 125 || string.charAt(i) == 91
						|| string.charAt(i) == 93 || string.charAt(i) == 41 || string.charAt(i) == 40) {
					// stack.push(string.charAt(i));
					checkString = checkString + string.charAt(i);
				}
			}
			// System.out.println(string);
			System.out.println(checkString);
			Stack<Character> openStack = new Stack<>();
			Stack<Character> closeStack = new Stack<>();

			for (int i = 0; i < checkString.length(); i++) {

				if (checkString.charAt(i) == 123 || checkString.charAt(i) == 91 || checkString.charAt(i) == 40) {
					openStack.push(checkString.charAt(i));
					Collections.sort(openStack);
				} else {
					closeStack.push(checkString.charAt(i));
					Collections.sort(closeStack);
				}
			}
			System.out.println(openStack);
			System.out.println(closeStack);

			int size = openStack.size();
			if (openStack.size() == closeStack.size()) {
				for (int i = 0; i < size; i++) {
					if (openStack.peek() + closeStack.peek() == 248) {
						openStack.pop();
						closeStack.pop();
					} else if (openStack.peek() + closeStack.peek() == 184) {
						openStack.pop();
						closeStack.pop();
					} else if (openStack.peek() + closeStack.peek() == 81) {
						openStack.pop();
						closeStack.pop();
					} else {
						System.out.println(string + " is unbalanced");
						break;
					}
				}
				if (openStack.isEmpty() && closeStack.isEmpty()) {
					System.out.println(string + " is balanced");
				}
			} else {
				System.out.println(string + " is unbalanced");
			}

		}
	}
}
