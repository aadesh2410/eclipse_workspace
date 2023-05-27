package com.demo;

import java.util.ArrayList;

//To copy data from one arraylist to other arraylist
public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> aList1 = new ArrayList<Integer>();
		ArrayList<Integer> aList2 = new ArrayList<Integer>();
		
		aList1.add(10);
		aList1.add(20);
		aList1.add(30);
		
		aList2.add(40);
		aList2.add(50);
		aList2.add(60);
		System.out.println(aList1);
		
		//one way to do this
//		for (int integer : aList1) {
//			aList2.add(integer);
//		}
//		
		
		//another way is
		//adds 2nd list to 1st at the end
		aList1.addAll(aList2);
		aList1.addAll(1, aList1);
		System.out.println(aList1);
	}
	
}
