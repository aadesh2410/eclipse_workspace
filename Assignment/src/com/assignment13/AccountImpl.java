package com.assignment13;

import java.util.Scanner;

/*
 * 1. Design the interface which contain below method public void getSavingAccount();
public void getUserDetails(String name,float balance); Then design the new class called as 
AccountImpl and implement that method, below input should be taken from user as name 
and balance into getSavingAccount method and pass input and print it into getUserDetails method.

 */
public class AccountImpl implements Account{

	@Override
	public void getSavingAccount() {
		Scanner scanner = new Scanner(System.in);
		String name;
		float balance;
		System.out.println("Enter account holder name");
		name = scanner.nextLine();
		System.out.println("Enter account balance");
		balance = scanner.nextFloat();
		getUserDetails(name, balance);
	}

	@Override
	public void getUserDetails(String name, float balance) {
		
		System.out.println("Account holder name is>> " + name);
		System.out.println("Account balance is >>" + balance);
		
	}
	
	
}
