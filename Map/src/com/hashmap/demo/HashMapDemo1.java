package com.hashmap.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

//print using iterator method
public class HashMapDemo1 {

	public static void main(String[] args) {

		
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "Aadesh");
		hashMap.put(105, "vaibhav");
		hashMap.put(102, "sam");

		
		
		// we use keyset method,so generic of key will be used
		Set<Integer> setofHashMap = hashMap.keySet();
		Iterator<Integer> itr = setofHashMap.iterator();
		
		
		//looping for printing using iterator
		while (itr.hasNext()) {

			int i = itr.next();
			System.out.println("Key >>" + i);
			System.out.println("Value >>" + hashMap.get(i));
		}
		
		//using entryset method
		HashMap<String, String> hashMap2 = new HashMap<>();
		hashMap2.put("Aadesh", "More");
		hashMap2.put("Vaibhav", "Kasar");
		hashMap2.put("prath", "Vane");
		
		Iterator<Map.Entry<String, String>> entry = hashMap2.entrySet().iterator();
		while(entry.hasNext()) {
			Map.Entry<String, String> i=entry.next();
			System.out.println("Key >> " + i.getKey());
			System.out.println("Value >> "+ i.getValue());
		}
		
		//For each method part fo JAVA8
		// ' -> is lambda expression '
		System.out.println("Using lambda expression");
		hashMap.forEach((k,v)-> System.out.println("key >> " + k+ " value >> " + v));
	}
}
