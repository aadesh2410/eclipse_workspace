package com.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

// introduce all the methods of LL
public class DemoLinkedList1 {

	
	
	public static void main(String[] args) {
		
		
		LinkedList linkedList = new LinkedList<>();
		//LinkedList<> linkedList1 = new LinkedList<>();
		//add method - add elements into the LL
		linkedList.add(35);
		linkedList.add("ASdesh");
		linkedList.add("timer");
		//linkedList1.add(21);
		//add with index
		linkedList.add(1, 31);
		//linkedList1.add(29);
		
		//addAll method
		//linkedList1.addAll(linkedList);
		
		
		//System.out.println(linkedList);
		//addAll customized
		//linkedList.addAll(2, linkedList1);
		
		//add first and last
		linkedList.addFirst(10);
		linkedList.addLast(20);
		linkedList.add(10);
		
		//clear removes all the list elements
		//linkedList1.clear();
		
		//contains checks whether given object is inside the list or not
		//System.out.println(linkedList.contains(35));
		
		//it prints all the LL elemetns in reverse order
		/*Iterator itr = linkedList.descendingIterator();			
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}*/
		
		//retrives the head of the LL but doesn't remove it
		System.out.println(linkedList.element());
		
		
		
		
		
		//get ll element at given index
		System.out.println(linkedList.get(4));		//timer
		
		//return index value of the first occurence of the given object
		System.out.println(linkedList.indexOf(10));   	// 0
		
		//return index value of the last occurence of the given object
		System.out.println(linkedList.lastIndexOf(10));		//6
		
		//return boolean and adds to the tails given object
		System.out.println(linkedList.offer("vaibhav")); 		//true
		
		
		//return head of the linkedlist
		linkedList.peek();
		
		//linkedList.removeAll(linkedList);
		
		System.out.println(linkedList);
		linkedList.set(3, 24);
		
		linkedList.toArray();
		
		//linkedList.
		
		System.out.println(linkedList);
		//System.out.println(linkedList1);
		
	}
}
