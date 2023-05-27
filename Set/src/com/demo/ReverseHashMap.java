package com.demo;

//import 
import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
//import java.util.TreeSet;

public class ReverseHashMap {
	public static String conRevstr(String S1) {
		// code here
		String S3 = S1; // AadeshMore
		String revStr = "";
		for (int i = 0; i < S3.length(); i++) {
			char ch = S3.charAt(i); // A a
			revStr = ch + revStr; // A (a+A)
			// System.out.println(revStr);
		}
		return revStr;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("aadesh", 1);
		hashMap.put("vaibhav", 2);
		hashMap.put("samruddhi", 3);
		hashMap.put("jayesh", 4);
//		ArrayList<String> treeSet = new ArrayList<>();
//		treeSet.add(hashMap.get(1));
//		System.out.println(treeSet);
//		System.out.println(ReverseHashMap.conRevstr(treeSet.get(0)));
		System.out.println(hashMap);

		TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println(treeMap);	
	}

}
