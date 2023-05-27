package com.demo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	
	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add("Aadesh");
		aList.add("Bhushan");
		aList.add("Pranav");
		
		System.out.println(aList);
		aList.add(2, "Aboli");
		System.out.println(aList);
		
	}
	
}
