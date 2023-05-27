package com.test;

public class MainTest {
	
	public static void main(String[] args) {
		
		
		//Scenario1
		//A a = new A();
		
		//Scenario2
		B b = new B();
		int temp = b.b;   //30 20????
		int temp1 = b.c; //
		int temp3 = b.a;
		
		//Scenario3
		A a = new B();
		int temp4 = a.b; //
		a.method2(); //exception in this... overriding takes place
		
		
	}
	
}
