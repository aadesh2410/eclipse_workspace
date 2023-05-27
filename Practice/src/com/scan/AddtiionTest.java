package com.scan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//import java.util.concurrent.;
public class AddtiionTest {
	public int add(int a, int b) {
		return a + b;
	}
	public static String concatenate(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		AddtiionTest add1 = new AddtiionTest();
		System.out.println("Enter 1st operand");
		int num1 = scan1.nextInt();
		System.out.println("Enter 2nd operand");
		int num2 = scan1.nextInt();
		System.out.println("Enter 1st string");
		String str1 = scan1.next();
		System.out.println("Enter 2nd string");
		String str2 = scan1.next();
		
		scan1.close();
		int result = add1.add(num1, num2);
		System.out.println("addition of entered 2 numbers = " + result);
		System.out.println("Concatenated string is >>" + concatenate(str1, str2));
		
		
		
		
		
		
		
	}
}
