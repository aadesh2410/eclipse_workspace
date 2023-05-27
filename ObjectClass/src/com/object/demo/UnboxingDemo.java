package com.object.demo;

public class UnboxingDemo {

	
	public static void main(String[] args) {
		
		
		//creating object of Integer class
		Integer integer = new Integer(1233);
		
		//both apprach is vaild 
		//int b = integer.intValue(); 
		//internally intValue() is used to unwrap
		int b = integer;
		
		//or directly
		Integer xInteger = 12;
		int a = xInteger.intValue();
		System.out.println(a + "        " + b);
	}
	
}
