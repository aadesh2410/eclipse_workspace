package com.assignment21;

import java.util.ArrayList;
import java.util.Collections;

//1. Design the method which return the list that contain the element as 
//Ram, Sohan, Ashok, Ajay, Prasanna now I want to sort that element based on descending order.

public class Program1 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("ram");
		nameList.add("sohan");
		nameList.add("ashok");
		nameList.add("ajay");
		nameList.add("prassanna");
		
		Collections.sort(nameList);
		Collections.reverse(nameList);
		
		for (String string : nameList) {
			System.out.println(string);
		}
	}
	
}
