package com.assignment;


//write a program  to print all even number from 50 to 75.

public class Program3 {
	public static void printEvenNumbers() {
		for(int i = 50; i <=75; i++) {
			if (i%2 == 0) {
				System.out.print(i+"\t");
				//System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		printEvenNumbers();
	}
}
