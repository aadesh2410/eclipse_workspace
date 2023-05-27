package com.calculator.demo;

public class Division {
	public static int div(int x, int y) {
		if (y == 0) {
			System.out.println("Cannot perform division as Denominator equals = 0 or invalid");
			return 0;
		}else {
			int result = x / y;
			return result;
		}
	}
}
