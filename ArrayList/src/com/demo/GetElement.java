package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * The first line has an integer . 
 * In each of the next n lines there will be an integer d denoting number of integers 
 * on that line and then there will be d space-separated integers. 
 * In the next line there will be an integer q denoting number of queries. 
 * Each query will consist of two integers x and y.
 * 
 * In each line, output the number located in yth position of xth line. 
 * If there is no such position, just print "ERROR!"
 */
public class GetElement {

	public static void main(String[] args) {

		// taking values for list size and the position at which we want to check

		// creating and empty arraylist

		// create an array which takes arraylist as an input
		// int [] intArray = new int[size];

//		System.out.println("Enter " + d + " no of list elements");
//		for (int i = 0; i < d; i++) {
//			arrayListExternal.add(scanner.nextInt());
//		}
//		if (x <= arrayListExternal.size() - 1) {
//			int result = arrayListExternal.get(x);
//			System.out.println(result);
//		} else {
//			System.out.println("ERROR !");
//		}
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of input lines");
		int n = scanner.nextInt();
		ArrayList<Integer>[] arrayListExternal = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> arrayListinternal = new ArrayList<>();
			System.out.println("enter the length of the list");
			int d = scanner.nextInt();
			// initialized every arraylist
			for (int j = 0; j < d; j++) {
				arrayListinternal.add(scanner.nextInt());
			}
			arrayListExternal[i] = arrayListinternal;
		}
		System.out.println("enter the position in the list");
		int x = scanner.nextInt();
		System.out.println("enter the number of the list you want to search for");
		int y = scanner.nextInt();

		System.out.println(arrayListExternal[y].get(x));
		scanner.close();
	}

}
