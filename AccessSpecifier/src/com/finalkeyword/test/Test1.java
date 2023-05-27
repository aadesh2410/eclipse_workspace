package com.finalkeyword.test;

//final methods
public class Test1 extends Test {

	public final void test1() {
		System.out.println("test m1");
		Test test = new Test1();
		test.m1();
	}
	
	//overidding final method shows compile time error
/*	public void m1() {
		
	}
*/	
	
	
}
