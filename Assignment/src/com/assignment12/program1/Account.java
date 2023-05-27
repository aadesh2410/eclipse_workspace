package com.assignment12.program1;

import java.util.Scanner;

public class Account {

	long accountNumber;
	String accountName;

	public void getAccountDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account holder name");
		accountName = scanner.nextLine();
		System.out.println("Enter account number");
		accountNumber = scanner.nextLong();
		getAccountInformation(accountName, accountNumber);
		//scanner.close();
	}

	private void getAccountInformation(String accName, long accNum) {
		System.out.println("Account holder name >>" + accName);
		System.out.println("Account number >>" + accNum);

	}

}
