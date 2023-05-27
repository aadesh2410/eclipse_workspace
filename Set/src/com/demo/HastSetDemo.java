package com.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HastSetDemo {

	
	public static void main(String[] args) {
		
		
		LinkedHashSet< Integer> hashSet	= new LinkedHashSet<>();
		//HashSet hashSet2 = new HashSet();
		hashSet.add(10);
		hashSet.add(10);
		hashSet.add(23);
		hashSet.add(10);
		hashSet.add(50);
		hashSet.add(0);
		
		TreeSet<Integer> linkedHashSet = new TreeSet<>(hashSet);
		System.out.println(hashSet.contains(0));
		
		System.out.println(hashSet);
		System.out.println(linkedHashSet);
	}
}
