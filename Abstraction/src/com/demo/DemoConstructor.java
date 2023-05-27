package com.demo;

public class DemoConstructor extends Test {

	public String city;

	/*public DemoConstructor(String name, int x, String city) {

		super(name, x);
		this.city = city;
		// invoking super class's constructor

	}*/
	
	
	@Override
	public boolean test(int x, int y) {
		if (x == y) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * public DemoConstructor(String name, int x) {
	 * 
	 * super(name,x); }
	 */

}
