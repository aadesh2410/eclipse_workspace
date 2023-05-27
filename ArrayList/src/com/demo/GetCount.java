package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

//consider a list of string objects and multiple duplicates are present
//return the number of duplications for each unique object
public class GetCount {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(60);
		list.add(30);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(60);
		list.add(50);
		list.add(10);
		list.add(10);
		list.add(100);

		System.out.println();

		HashSet<Integer> uniqueSet = new HashSet<>(list);
		ArrayList<Integer> uniqueList = new ArrayList<>(uniqueSet);
		for (Integer integer : uniqueList) {
			System.out.println(integer);
		}
		int freq[] = new int[uniqueList.size()];
		for (int i = 0; i < uniqueList.size(); i++) {

			freq[i] = Collections.frequency(list, uniqueList.get(i));
		}

		for (int i = 0; i < freq.length; i++) {
			System.out.println("The object " + uniqueList.get(i) + " is repeated " + (freq[i] - 1) + " times");
		}
		
		
	}

}
