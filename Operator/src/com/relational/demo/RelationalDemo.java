package com.relational.demo;

public class RelationalDemo {
	
	public static void main (String[] args) {
		boolean var1 = And.and(5, 16);
		boolean var2 = Or.or(15, 47);
		boolean var3 = Not.not(15, 15);
	
		System.out.println("AND operation result = " + var1);
		System.out.println("OR operation result = " + var2);
		System.out.println("NOT operation result = " + var3);
	}
}
