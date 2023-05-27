package com.demo;

//Mock INterview - 22nd Jan:
//amrstrong number

public class Test {

	int flag = 0;
	
	public static void checkArmstrongNumber(int num) {
		int dip_num= 0;
		dip_num = num;
		int sum = 0;
		while (num != 0) {
			int remainder = num % 10;
			num = num / 10;
			sum = (int) (sum + Math.pow(remainder, 3));
			
		}
		if (sum == dip_num ) {
			System.out.println("Yes, it is an armstrong number");
			//flag = 1;
		} else {
			System.out.println("No, not an armstrong number");
			//flag = 0;
		}
	}

	public static void main(String[] args) {

		
		
	}

}
