package com.hsbc.day3;

public class Solution47 {
	
	public static void main(String args[]) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.deposit(25000);
		bankAccount.withdraw(1400);
		bankAccount.getBalance();
		
		BankAccount.InterestAdder adder = bankAccount.new InterestAdder();
		adder.updateBalanceWithInterest();
		
		bankAccount.getBalance();
		
	}
	
}
/*
 	BankAccount class implements:
 	 >> deposit of money to the account
 	 >> withdrawl of money from the account
 	 >> retrieval of balance
 	 >> inner class that consist of method to update balance with interest
 */
class BankAccount {
	private double balance;
	
	public BankAccount() {
		this.balance = 0;
	}
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("$ " + amount + " deposited into account");
	}
	
	
	public void withdraw(double amount) {
		if(amount > this.balance)
			System.out.println("Insuffient balance for withdrawl");
		else {
			this.balance -= amount;
			System.out.println("$ " + amount + " withdrawn from account");
		}
			
	}
	public void getBalance() {
		System.out.println("Current Balance: $ " + this.balance );
		
	}
	/*
	 	Inner class implementing updating of interest using inner class
	 */
	class InterestAdder{
		
		void updateBalanceWithInterest() {
			double interest = (balance * 0.12)/12;
			balance += interest;
			System.out.println("Balance after interest addition: $ " + balance);
		}
		
	}
	
	
	
}
