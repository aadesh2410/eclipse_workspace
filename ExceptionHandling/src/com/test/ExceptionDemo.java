package com.test;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		try {
			int a = 6/0;
		}
		catch (Exception e) {
			System.out.println("Undefined division "+e);
		}
		System.out.println("Heyy");
	}
}
