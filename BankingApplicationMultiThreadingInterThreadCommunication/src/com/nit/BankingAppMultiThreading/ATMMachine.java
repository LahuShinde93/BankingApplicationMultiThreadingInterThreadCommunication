package com.nit.BankingAppMultiThreading;

public class ATMMachine {

	public static void main(String[] args) {
		
		Account acc1 = new Account(5000);

		Drawer withdrow = new Drawer(acc1);
		Depositor deposit = new Depositor(acc1);
		
		deposit.start();
		withdrow.start(); 
	}
 
}
