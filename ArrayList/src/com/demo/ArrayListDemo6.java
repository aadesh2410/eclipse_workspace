package com.demo;

import java.util.ArrayList;

//merging 2 arraylist
public class ArrayListDemo6 {

	public static void main(String[] args) {

		ArrayList<Integer> aList1 = new ArrayList<Integer>();

		aList1.add(10);
		aList1.add(20);
		aList1.add(30);
		aList1.add(40);
		aList1.add(50);
		aList1.add(60);

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("aadesh");
		aList.add("Pranav");
		aList.add("Aadesh");
		aList.add("Bhushan");
		aList.add("Paresh");
		aList.add("Samruddhi");
		
		//merging into another alist
		//using addall methods
		//both the lists are as it is
		ArrayList alistmerged = new ArrayList();
		alistmerged.addAll(aList1);
		alistmerged.addAll(aList);
		System.out.println(alistmerged);
		
	}

}
