package com.synchronization;

public class Account {

	private int balance = 5000;

	public int getBalance() {
		return balance;
	}

	public int withdrawAmount(int amount) {

		balance = balance - amount;

		return balance;
	}
}
