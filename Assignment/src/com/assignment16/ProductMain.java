package com.assignment16;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Enter the weight ");

		try {
			product.productCheck(scanner.nextInt());
		} catch (ProductException e) {
			System.out.println(e);
		}

	}
}
