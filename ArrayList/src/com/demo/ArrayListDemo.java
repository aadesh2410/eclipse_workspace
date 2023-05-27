package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	int x = 25;
	
	public static void main(String[] args) {

		// creating alist object with default constructor
		// size = 10(default)
		ArrayList aList = new ArrayList();
		
		
		//inserting objects in arraylist
		//duplicates are allowed
		//insertion order is allowed(the way in which objects are inserted, same preferance they are returned while printing)
		//heterogenous dataypes are allowed
		aList.add(10);
		aList.add(null);
		aList.add("Aadesh");
		aList.add(new ArrayListDemo());
		//aList.add(new int [] {1,2,3,4,5});
		aList.add(10);
		aList.add(null);
		//adding at specific index and will also relace if value present at that index
		aList.add(0, 20);
		//System.out.println(aList);
		
		//removing objects from arraylist
		//if removing from unknown location, throwns IndexOutOFBoundException
		aList.remove(1); //will remove null object at index 1
		//System.out.println(aList);

		System.out.println("Arrlist object using iterator method");
		Iterator itr = aList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("index value" + aList.get(1));
	}
}
