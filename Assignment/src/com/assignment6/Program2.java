package com.assignment6;

import java.util.Scanner;

//2. Design method void multiplication (int no) and 
//print the multiplication table.
//( Example enter the no=5 then output like 

public class Program2 {
	
	public void multiplication(int x) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(x + " * " +  i  + " = " + x*i);
		}
	}
	public static void main(String[] args) {
		Program2 program2 = new Program2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number whose table format is required");
		program2.multiplication(scanner.nextInt());
		scanner.close();
	}

}
