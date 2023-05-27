package com.test;

public class TestDemo1 extends TestDemo {

	public TestDemo1(String name, int roll_no) {
		super(name, roll_no);
		System.out.println(super.test1);
	}

	public void m2() {
		super.testMethod();
		System.out.println("hi, m2 from child class");
	}
	
	
	
}
