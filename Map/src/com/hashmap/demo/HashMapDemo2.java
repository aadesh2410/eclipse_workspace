package com.hashmap.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//design a method which returns a hashmap object
public class HashMapDemo2 {

	public HashMap<Integer, String> getHashMap() {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(101, "Aadesh");
		hashMap.put(105, "vaibhav");
		hashMap.put(102, "sam");
		return hashMap;
	}

	public static void main(String[] args) {

		HashMapDemo2 hm2 = new HashMapDemo2();

		// 1st approach
		HashMap<Integer, String> hMap = hm2.getHashMap();
		// 2nd approach
		System.out.println(hm2.getHashMap());
		// 3rd approach
		Map<Integer, String> map = hm2.getHashMap();
		System.out.println(map);

		Iterator<Map.Entry<Integer, String>> itr = hMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> map1 = itr.next();
			System.out.println("Key >> " + map1.getKey());
			System.out.println("Value >> " + map1.getValue());
		}
		
	}

}
