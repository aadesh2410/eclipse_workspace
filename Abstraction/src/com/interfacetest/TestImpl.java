package com.interfacetest;
import com.demo.*;

//interfaces are implemented
//this particular class is called as implemented class
public class TestImpl extends DemoConstructor implements Test,Test2,Test3{
	
	
	

	@Override
	public void m1() {
		System.out.println("interface m1");
	}

	@Override
	public void m2() {
		System.out.println("interface m2");
	}

	@Override
	public void m3() {
		System.out.println("interface m3");
	}

	@Override
	public void m4() {
		System.out.println("interface m4");
	}

	@Override
	public void m5() {
		System.out.println("interface m5");
	}
	
	public void m6() {
		System.out.println("class m6");
	}

	@Override
	public void m7() {
		System.out.println("multiple interited interface m7");
	}

}
