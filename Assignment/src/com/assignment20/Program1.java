package com.assignment20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. Write program to add the five students mobile number into arraylist
//and iterate that elements using iterator. 
public class Program1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Long> mobileList = new ArrayList<Long>();
		System.out.println("Enter the mobile numbers");
		for(int i = 0; i < 5; i++) {
			mobileList.add(scanner.nextLong());
		}
		System.out.println("The list of entered mobile numbers is >>");
		for (Long long1 : mobileList) {
			System.out.println(long1);
		}
		scanner.close();
	}
}
