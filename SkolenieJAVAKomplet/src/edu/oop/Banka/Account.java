package edu.oop.Banka;

public class Account {
	
	private double balance;
	private double interest;
	private int accountNumber;
	private static int numberofAccounts = 1000000;
	
	Account() {
		//nepotrebujeme setAccountNumber lebo toto mi to zabezpeci
		this.accountNumber = numberofAccounts++;		
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	
}
