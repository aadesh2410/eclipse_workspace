package com.assignment10;

import java.util.Scanner;

/*
 * 3. Write java program to check whether number is Armstrong or not.(A positive number is called armstrong number if it is equal
 *  to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc. 
 *  Let's try to understand why 153 is an Armstrong number.
153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153)

 */
public class ArmstrongNumber {

	static int flag;

	public void isArmstrongNumber(int number) {
		int copyNumber = number, sum = 0;

		while (number != 0) {
			int remainder = number % 10;
			// System.out.println(remainder);
			number = number / 10;
			// System.out.println(number);
			sum = (int) (sum + Math.pow(remainder, 3));
			// System.out.println(sum);
		}
		if (sum == copyNumber) {
			flag = 1;
		} else {
			flag = 0;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArmstrongNumber test = new ArmstrongNumber();
		System.out.println("Enter a number to check for ArmstrongNumber");

		int temp = scanner.nextInt();
		if (temp >= 0) {
			test.isArmstrongNumber(temp);

			if (flag == 1) {
				System.out.println("Yes, " + temp + " is an ArmstrongNumber");
			} else {
				System.out.println("No, " + temp + " is not an ArmstrongNumber");
			}
		} else {
			System.out.println("INVALID INPUT");
		}
		scanner.close();
	}
}
