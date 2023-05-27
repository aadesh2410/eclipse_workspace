package com.ternary.demo;

public class TernaryOperator {
	public static void main(String[] args) {
		int x = 15;
		int y = 12;
		int num = (x > y) ? (x = 56) : (y = 23);
		System.out.println(num);
		int str = (x > y) ? ((x == y) ? x++ : y++) : (x = 10);
		System.out.println(str);
	}
}
