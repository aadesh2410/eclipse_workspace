package com.finalkeyword.test;

public  class Test {

	//final varaibles
	final int A;
	final double PI = 3.142323;
	
	//initializer block
	/*{
		A = 210;
	}
	*/
	//initializing using a static block
	/*static {
		A = 210;
	}
	*/
	
	//initializing using a constructor
	//if multiple constructor then all constructor must have uninitialized variables initializers
	public Test() {
		this.A = 12;
	}
	
	
	//m1 method for overridding
	public final void m1() {
		
	}
	
	
	
	public static void main(String[] args) {
		Test test= new Test();
		System.out.println(test.A);
	}
}
