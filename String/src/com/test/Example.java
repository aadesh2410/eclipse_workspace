package com.test;


//difference between equals and == 
public class Example {
	public static void main(String[] args) {
		
		
		
		//by using literal
		String s1 = "Pune";
		
		//by using new
		String s2 = new String("Pune");
		
		//checks referance of objects are same or not
		System.out.println(s1 == s2); //false
		
		//checks content of both objects are equal or not
		System.out.println(s1.equals(s2)); //true
	}
}
