package com.synchronization;

public class AccountDetails implements Runnable {

	Account acc = new Account();

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			makeWithdraw(500);
		}

	}

	private synchronized void makeWithdraw(int amount) {

		if (amount <= acc.getBalance()) {
			System.out.println(Thread.currentThread().getName() + "  Before balance" + acc.getBalance());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int balance = acc.withdrawAmount(amount);
			System.out.println(" After balance " + balance);
		} else {
			System.out.println("Amount exceeds withdraw amount");
		}
	}

}
