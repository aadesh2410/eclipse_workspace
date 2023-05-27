package com.assignment15;

import java.util.Scanner;

/*
 * 2.1 Design the Account class which contain id, accountNumber and balance.
Design another class called as SavingAccount extends Account that contain withdrawAmount. 
Design class AccountDetails class in which below methods. 
Public void getAccountDetails () 
public static int getWithdrawDetails(Account account) 

 */
public class AccountDetails {

	public void getAccountDetails() {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		System.out.println("Enter the account balance");
		account.setAccountBalance(scanner.nextInt());
		System.out.println("Enter the account Id");
		account.setAccountId(scanner.nextInt());
		System.out.println("Enter the account Number");
		account.setAccountNumber(scanner.nextLong());

		System.out.println("Account details are as follows >> ");
		System.out.println("Account balance >> " + account.getAccountBalance());
		System.out.println("Account Id >> " + account.getAccountId());
		System.out.println("Account Number >> " + account.getAccountNumber());
		getWithdrawDetails(account);
	}

	public static int getWithdrawDetails(Account account) {
		int currentBalance = 0;
		System.out.println("Enter the amount for withdrawal>>");

		Scanner scanner = new Scanner(System.in);
		int withdrawAmount = scanner.nextInt();
		if (account.getAccountBalance() > withdrawAmount) {
			currentBalance = account.getAccountBalance() - withdrawAmount;
		}
		System.out.println("Your current account balance is>>" + currentBalance);

		return currentBalance;
	}

}
