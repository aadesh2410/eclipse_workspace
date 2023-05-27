package com.assignment20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2. Design the generics arraylist for string and add five cities into it 
//and iterate that using for each loop.

public class Program2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> cityList = new ArrayList<String>();
		System.out.println("Enter city names ");
		for(int i = 0; i < 5;i++) {
			cityList.add(scanner.next());
		}
		System.out.println("List of entered cities >>");
		for (String string : cityList) {
			System.out.println(string);
		}
		scanner.close();
	}
}
