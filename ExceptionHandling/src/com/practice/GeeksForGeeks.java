package com.practice;

import java.util.Scanner;

public class GeeksForGeeks {

	private int bank_balance;

	public int getBank_balance() {
		return bank_balance;
	}

	public void setBank_balance(int bank_balance) {
		this.bank_balance = bank_balance;
	}

	public void withdrawAmount(int amount) {

		bank_balance = bank_balance - amount;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		GeeksForGeeks test = new GeeksForGeeks();
		System.out.println("Enter the bank balance");
		test.setBank_balance(scanner.nextInt());
		System.out.println("Enter the amount to withdraw");
		int temp = scanner.nextInt();
		try {

			if (temp >= test.bank_balance) {
				throw new Exception("Insufficient Balance");
			} else {
				test.withdrawAmount(temp);
			}
			System.out.println("Current bank balance is = " + test.getBank_balance());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}
}
