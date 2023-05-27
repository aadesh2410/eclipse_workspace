package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// creating a alist in generic format with Integer Class as datatype
		//no warnings are shown as such
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		aList.add(50);
		
		//print alist in array format
		System.out.println(aList);
		
		//for each loop to print alist 
		for (int i : aList) {
			System.out.print(i + "	");
			
		}
		System.out.println();
		//iterator method to print
		Iterator<Integer> itr = aList.iterator();
		
		while(itr.hasNext()) {	//check empty or not
			System.out.println(itr.next()); //returns next element in the list
		}
		
	
	}

}
