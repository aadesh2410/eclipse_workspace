package com.assignment12.program1;

import java.util.Scanner;

public class SavingAccount extends Account {

	static String accountType = "Saving";
	long balance;

	// getting user input
	public void getSavingAccountDetails() {
		System.out.println("Total balance is>>");

		Scanner scanner = new Scanner(System.in);
		balance = scanner.nextInt();
		getSavingAccountInformation(accountType,balance);
	}

	private void getSavingAccountInformation(String accType, long accBalance) {
		System.out.println("User account type >> " + accType);
		System.out.println("Account balance >>" + accBalance);
	}

}
