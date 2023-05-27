package com.hashmap.demo;

import java.util.HashMap;

import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(10, 20);
		hashMap.put(20, 30);
		hashMap.put(10, 10);
		hashMap.put(10, 10);
		System.out.println(hashMap);

		TreeMap<Integer, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println(treeMap);
	}

}