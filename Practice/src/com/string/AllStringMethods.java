package com.string;

import java.util.*;
import java.io.*;
import java.lang.*;

public class AllStringMethods {
	public static void main(String[] args) {
		String s1 = new String("Aadesh");
		String s2 = new String("More");

		// Scanner test = new Scanner(System.in);
		// String s1 = test.nextLine();
		// String s2 = test.nextLine();

		// length method
		int output1 = s1.length();
		System.out.println("Length = " + output1);

		// charAt method
		char output2 = s1.charAt(2);
		System.out.println("char at method output = " + output2);

		// substring method
		String output3 = s1.substring(3);
		System.out.println("substring 1st = " + output3);

		// substring method
		String output4 = s1.substring(2, 5);
		System.out.println("Substring 2nd method = " + output4);

		// concate method
		String output5 = s1.concat(s2);
		System.out.println("After concatenation = " + output5);

		// indexOf method
		String test = "Learn from learning";
		int output6 = test.indexOf("learn");
		System.out.println("Index of 1st = " + output6);

		// indexOf method
		int output7 = test.indexOf("learn", 6);
		System.out.println("Indexof 2nd = " + output7);

		// lastIndexOf method
		int output8 = test.lastIndexOf('a');
		System.out.println("Last of index method = " + output8);

		// equals method
		String str1 = new String("Aadesh");
		String str2 = new String("aadesh");
		boolean output9 = str1.equals(str2);
		System.out.println("equal to method = " + output9);

		// equalIgnoreCase
		boolean output10 = str1.equalsIgnoreCase(str2);
		System.out.println("equal Ignore case considerations method = " + output10);

		// compareTo method
		int output11 = s1.compareTo(s2);
		int output12 = str1.compareToIgnoreCase(str2);
		System.out.println("Compare to = " + output11);
		System.out.println("Compare to ignore case = " + output12);

		// lowercase uppercase method
		String output13 = s1.toLowerCase();
		String output14 = s2.toUpperCase();
		System.out.println("Lower case = " + output13);
		System.out.println("Upper case = " + output14);

		// trim method
		String str3 = new String(" i am aadesh more   ");
		String output15 = str3.trim();
		System.out.println("Trimmed string is = " + output15);

		// replace method
		String output16 = s1.replace('A', 'b');
		System.out.println("Replaced a's by b's = " + output16);
		
		int temp = Integer.valueOf(s1);
		int temp2 = Integer.valueOf(s2);
		System.out.println(temp + temp2);
	}

}
