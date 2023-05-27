package com.demo;

import java.util.LinkedList;
/*
 * 
 * sequence is preserved
 * null is allowed
 * duplicates allowed
 * heterogeneous data types allowed
 * 
 */

//basic ll program , getting to know methods generic + non generic declarations 
public class DemoLinkedList {

	
	public static void main(String[] args) {
		
		//non generic
		//LinkedList linkedList = new LinkedList<>();
		
		//generic
		LinkedList<Integer> linkedList = new LinkedList<>() ;
		
		
		
		//adding elements to the LinkedList
		linkedList.add(10);
		linkedList.add(85);
		linkedList.add(35);
		linkedList.add(null);
		linkedList.add(35);
		
		//adding and removing from start and end
		linkedList.addFirst(21);
		linkedList.addLast(60);
		
		linkedList.add(10,25);
		
	
		
		System.out.println(linkedList.size());
		
		
		System.out.println(linkedList);
		
	}
	
}
