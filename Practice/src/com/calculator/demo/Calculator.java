package com.calculator.demo;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Enter valid Operator from given list (+ - / * %)");
		Scanner demo_scanner = new Scanner(System.in);
		String operator = demo_scanner.nextLine();
		System.out.println("Enter first Operand");
		int num1 = demo_scanner.nextInt();
		System.out.println("Enter second Operand");
		int num2 = demo_scanner.nextInt();
		demo_scanner.close();

		switch (operator) {
		case "+":
			int result1 = Addition.add(num1, num2);
			System.out.println("You have entered Addition as your operator");
			System.out.println("Addition of entered values = " + result1);
			break;
		case "-":
			int result2 = Substraction.sub(num1, num2);
			System.out.println("You have entered Substraction as your operator");
			System.out.println("Substraction of entered values = " + result2);
			break;
		case "*":
			int result3 = Multiplication.mul(num1, num2);
			System.out.println("You have entered Multiplication as your operator");
			System.out.println("Multiplication of entered values = " + result3);
			break;
		case "/":
			int result4 = Division.div(num1, num2);
			System.out.println("You have entered Division as your operator");
			System.out.println("Division of entered values = " + result4);
			break;
		case "%":
			int result5 = Modulus.mod(num1, num2);
			System.out.println("You have entered Modulus as your operator");
			System.out.println("Modulus of entered values = " + result5);
			break;

		}
	}

}
