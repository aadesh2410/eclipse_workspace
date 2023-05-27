package com.test1;

import com.calculator.demo.Modulus;
import com.test2.Multiplication;
import java.util.Scanner;


public class Addition {
	public static void main(String [] args) {
		//int num1 = 10;
		//int num2 = 15;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		//scan.close();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		scan.close();
		//Multiplication mult = new Multiplication();
		int result = Multiplication.mul(num1, num2);
		System.out.println(result);
		
		
		
		Modulus mod = new Modulus();
		int result1 = Modulus.mod(num1, num2);
		System.out.println(result1);
		
		

	}
}
