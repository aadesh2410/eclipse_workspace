package com.interfacetest;



public interface Test extends Test2,Test3{
	
	//public abstract methods
	
	public abstract void m1();
	public abstract void m2();
	
	//by default these methods are made public abstract
	// by the JVM
	public void m3();
	abstract void m4();
	void m5();
	
	//for multiple inheritance proof
	void m7();
	
	
}
