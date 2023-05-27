package com.demo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
			TreeSet tSet = new TreeSet<>();
			tSet.add(10);
			tSet.add(20);
			tSet.add(30);
			
			
			TreeSet tSet2 = new TreeSet<>(tSet);
			tSet.add(60);
			tSet.add(50);
			tSet.add(40);
			
			
			TreeSet< Integer>treeSet	= new TreeSet<>();
			System.out.println(tSet2);
		}

}
