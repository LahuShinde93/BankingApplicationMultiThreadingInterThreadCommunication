package com.nit.BankingAppMultiThreading;

public class Account {
	
	private int balance = 0;
	
	
	public Account(int balance) {
		super();
		this.balance = balance;
	} 


	public synchronized void withdraw(int amount) {
		
		while(balance<amount) {
			try {
			 
			 wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
		
		balance -=amount; 
		
		System.out.println("Current balance is after withdraw : "+balance);
		 notify();
	}
	
	
	public synchronized void deposit(int amount) {
		
		balance+=amount;
		
		System.out.println("Current balance after deposit : "+balance);
		notify();
	}
	
}
