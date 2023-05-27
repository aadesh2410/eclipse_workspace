package com.test;

import java.util.Scanner;

public class TestMain {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TestDemo1 testDemo = new TestDemo1(scanner.nextLine(), scanner.nextInt());
		testDemo.m2();
		testDemo.testMethod();
		System.out.println(testDemo.test +"		"+ testDemo.test1);
		scanner.close();
	}
}
