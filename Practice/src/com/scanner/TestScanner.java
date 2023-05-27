package com.scanner;

import java.util.Scanner;
//import java.math.BigInteger;


//Difference between next() and nextLine() methods
public class TestScanner {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		int i = 0;
		while(i < 2) {
		String temp1 = scan.next();
		System.out.println(temp1);
		i--;
		}
		System.out.println("Enter second string");
		String temp = scan.nextLine();
		//System.out.println(temp1);
		System.out.println(temp);
		scan.close();
	
	 //"/n"
	 
		//10! = 10*9*8*7*6*5*4*3*2*1
		//15! = 
		//BIGINTEGER
		
		
		
		
	}
}
