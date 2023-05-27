package com.test;

public class Example5 {

	public static void main(String[] args) {
		String s1 = new String("Pune");
		String s2 = new String("Pune");
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
	}
}
