package com.test;

public class Example3 {

	public static void main(String[] args) {
		String s1 = new String("Pune");
		String s2 = new String("Mumbai");
		// equalling the objects
		s2 = s1;
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
	}
}
