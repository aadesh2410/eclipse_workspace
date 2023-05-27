package com.assignment5;

public class PositiveNegative {
	public static void main(String[] args) {
		int check_variable = 10;
		//int check_variable = 0;
		//int check_variable = -10;
		if(check_variable >= 0  ) {
			if(check_variable == 0) {
				System.out.println("Entered value is neither POSITIVE nor NEGATIVE");
			}
			else {
				System.out.println("Entered value is POSITIVE");
			}
		}
		else {
			System.out.println("Entered value is NEGATIVE");
		}
	}
}
