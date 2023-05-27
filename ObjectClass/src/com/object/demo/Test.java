package com.object.demo;

public class Test {
	
	int testid = 10;
	
	
	public static void main(String[] args)  {
		Test test = new Test();
		Test test1 = new Test();
		
		//getClass method of Object class
		System.out.println(test.getClass().getName());
		System.out.println(test.getClass().getSimpleName());
		System.out.println(test.getClass().getSuperclass());
	
		
//		//hashCode method of object class
		System.out.println(test.hashCode());
		System.out.println(test1.hashCode());
//	
	
		//equals method
		boolean temp = test1.equals(test1);
		System.out.println(temp);
		
		//Object object = test.clone();
		
		//System.out.println(object);
		
	
	
	
	
	}
	
}
