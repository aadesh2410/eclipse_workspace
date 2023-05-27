package com.test;

public abstract class Test {

	// concrete method
	public void m1() {
		System.out.println("test m1");
	}

	// incomplete method
	public abstract void m2();

	abstract void m3();
	
	//constructor
	//used to initialize some concrete methods
	public Test() {
		
	}

}
