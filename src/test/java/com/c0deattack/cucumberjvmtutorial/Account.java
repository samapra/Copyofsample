package com.c0deattack.cucumberjvmtutorial;

public class Account {

	private int balance;
	private String accountType; 
	
	public Account() {
		this.balance = 0;
		this.accountType = "Saving";
	}
	
	public Account(int initialDeposit, String accountType) {
		this.balance = initialDeposit;
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}
	public String getAccountType() {
		return accountType;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount){
		this.balance -= amount;
	}
}