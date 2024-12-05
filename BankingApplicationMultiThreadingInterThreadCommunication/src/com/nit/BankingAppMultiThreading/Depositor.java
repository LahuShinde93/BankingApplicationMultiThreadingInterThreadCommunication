package com.nit.BankingAppMultiThreading;

public class Depositor extends Thread {

	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		int deposits[] = { 2000, 6000, 3000 };

		for (int d : deposits) {
			account.deposit(d);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		}
	}
}
