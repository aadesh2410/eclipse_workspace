package com.assignment;

public class DeclareLocalVariable {
	
	public static void demoMethod() {
		int local_variable_inside_method = 10;
		System.out.println("Value of local variable declared inside other than MAIn method = " + local_variable_inside_method);
	}
	public static void main(String[] args) {
		int x = 69;
		System.out.println("Local Variable created and declared ");
		System.out.println("Value of X = " + x);
		demoMethod();
	}
}