package com.example;

public class Demo {
	private int test = 133;

	int a = 12;

	void demo() {
		System.out.println("Inside deafualt method");
	}

	private void test() {
		System.out.println("Hello");

		// int a = 123;

	}
	
	protected long temp = 130989;
	
	protected void test1() {
		System.out.println("Protected method");
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.test + 10);
		Test test = new Test();
		test.m1();
		System.out.println(demo.temp);
	}

}
