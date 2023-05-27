package com.demo;

import java.util.ArrayList;

//method demo
public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		System.out.println("is empty " + aList.isEmpty());
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		aList.add(50);
		aList.add(10);
		//return size in integer
		System.out.println("Size >> " + aList.size());
		
		//returns boolean if given element present in the alist
		System.out.println("Contains >> " + aList.contains(10));
		
		//return boolean if given alist is empty or not
		System.out.println("is empty >> " + aList.isEmpty());
		
		//returns index to the element
		System.out.println("index of 10 >> " + aList.indexOf(10));
		System.out.println("last index of 10 >> " + aList.lastIndexOf(10));
	}
	
}
