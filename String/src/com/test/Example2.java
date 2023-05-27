package com.test;

public class Example2 {

	public static void main(String[] args) {

		String s1 = "Pune";
		String s2 = new String("Mumbai");

		s2 = s1;
		System.out.println(s1 == s2); // true
		System.out.println(s2); // true

	}
}
