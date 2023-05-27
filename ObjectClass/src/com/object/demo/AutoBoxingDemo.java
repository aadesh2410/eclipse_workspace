package com.object.demo;

public class AutoBoxingDemo {
	
	public static void main(String[] args) {
		
		
		// int into Integer
		int a = 32;
		
		//converting int a into Ingeter class object
		// approach was till JAVA 1.5
		Integer.valueOf(a);
		
		//internally does Integer j = Integer.valueof(a)
		Integer j = a;
		
		System.out.println(j);
	}
	
}
