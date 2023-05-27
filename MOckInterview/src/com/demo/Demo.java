package com.demo;

//count the characters inside the given string
//String str="hello world";
public class Demo  {

	public static void main(String[] args) {
		int count = 0;
		String string = "hello world";
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
//		int numOfCharaters = string.length() - count;
//		System.out.println("num of chars >>  " + numOfCharaters);
	}
	
}
