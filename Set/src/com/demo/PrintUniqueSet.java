package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * You are given  pairs of strings. Two pairs (a,b) and (c,d)  are identical if a==c and b==d.
 *  That also implies (a,b) is not same as (b,a) . 
 *  After taking each pair as input, you need to print number of unique pairs you currently have.
 *  
 *  
input:
john tom
john mary
john tom
mary anna
mary anna
output
1
2
2
3
3
 */


public class PrintUniqueSet {

	public static void main(String[] args) {
			HashSet<ArrayList<String>> setOfArray = new HashSet<>();
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter 5 entries");
			for(int i = 0; i < 5; i++) {
				ArrayList<String> nameList = new ArrayList<>();
				System.out.println("enter 1st name");
				nameList.add(scanner.next());
				System.out.println("enter second name");
				nameList.add(scanner.next());
				setOfArray.add(nameList);
				System.out.println(setOfArray.size());
			}
			System.out.println(setOfArray);
		
	}
	
	
}
