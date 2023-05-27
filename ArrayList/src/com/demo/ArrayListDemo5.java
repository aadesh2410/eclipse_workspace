package com.demo;

import java.util.ArrayList;
import java.util.Collections;

//sort a String ArrayList alphabetically
public class ArrayListDemo5 {

	public static void main(String[] args) {

		ArrayList<String> aList = new ArrayList<>();

		aList.add("aadesh");
		aList.add("Pranav");
		aList.add("Aadesh");
		aList.add("Bhushan");
		aList.add("Paresh");
		aList.add("Samruddhi");
		
		
		System.out.println(aList);
		
		//use Collection class sort method
		//sort on natural order basis
		Collections.sort(aList);
		
		System.out.println(aList);
	}

}
