package com.assignment7;

import java.util.Scanner;

//Design method public int getNumberCube(int num), return int value to that method and result should be into main method.
public class Cube {

	public int getNumberCube(int num) {
		return num * num * num;
	}

	public static void main(String[] args) {
		Cube program2 = new Cube();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		scanner.close();
		System.out.println("Cube of " + num + " is " + program2.getNumberCube(num));
	}
}
