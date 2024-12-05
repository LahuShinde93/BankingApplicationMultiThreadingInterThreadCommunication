package com.nit.BankingAppMultiThreading;

public class Drawer extends Thread{

	private Account account; //HAS-A Relation

	public Drawer(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		int withdrawals[]= {1000,5000,6000};
		
		for(int i:withdrawals) {
			account.withdraw(i);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		 
	}
	
}
