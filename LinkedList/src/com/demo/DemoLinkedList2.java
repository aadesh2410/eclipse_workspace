package com.demo;

import java.util.LinkedList;

//constructor demonstration
public class DemoLinkedList2 {

	
	public static void main(String[] args) {
		
		
		LinkedList linkedList1 = new LinkedList<>();
		
		linkedList1.add(10);
		linkedList1.add(20);
		linkedList1.add(30);
		
		LinkedList linkedList = new LinkedList<>(linkedList1);
		
		linkedList.add(40);
		linkedList.add(50);
		
		System.out.println(linkedList1);
		System.out.println(linkedList);
		
	}
}
