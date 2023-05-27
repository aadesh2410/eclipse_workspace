package com.program2;

public class LeapYear {

	public static void checkLeapYear(int year) {
		if (year > 0) {

			if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				System.out.println("Entered year is a Leap Year");
			} else {
				System.out.println("Entered year is not a Leap Year");
			}

		} else {
			System.out.println("Invalid Input");
		}
	}

	public static void main(String[] args) {
		int input_year = 1600;
		checkLeapYear(input_year);

	}
}
