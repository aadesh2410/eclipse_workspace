package com.program7;

public class Square {
	public static int getSquare(int x) {
		int result = x * x;
		
		return result;

	}

	public static void main(String[] args) {
		int number = -53;
		int result = getSquare(number);
		System.out.println("Sqaure of the number = " + result);
	}
}
