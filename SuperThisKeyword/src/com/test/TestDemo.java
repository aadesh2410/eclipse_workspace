package com.test;

public class TestDemo {

	String test;

	int test1 = 124;

	public TestDemo(String name) {
		this.test = name;
	}

	public TestDemo(String name, int roll_no) {
		this(name);
		this.test1 = roll_no;
	}

	public void testMethod() {
		System.out.println("Hi, method from testDemo");
	}
	
	//abstract void m2();
}
