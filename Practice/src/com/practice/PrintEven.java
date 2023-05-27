package com.practice;
import java.util.*;

public class PrintEven {
	public static void main(String[] args) {
		System.out.println("Enter Value until which even are to be printed");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		for(int i = 0; i < number; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
