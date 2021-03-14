package com.meritamerica.assignment2;

/**
 * This Class represents a typical Checking Account for MeritAmeriaBank.
 * As any Bank Account, it inherits attribute \accountNumber\, \balance\, \interestRate\ from
 * its parent class. 
 */
public class CheckingAccount extends BankAccount{

/* ****** CONSTANTS and INSTANCE VARIABLES*******/
private static final double INTEREST_RATE = 0.0001;
	
/* ****** CONSTRUCTOR **********/
public CheckingAccount(double balance) {
	super(balance, INTEREST_RATE);
	setBalance(balance);
	setInterestRate(INTEREST_RATE);
		  
	}
	
/* ******** CLASS METHODS **********/ 
/* ** Implicit Setter and Getter from parent class BankAccount**/
//implicit getBalance()
//implicit setBalance()
//implicit getInterestRate()
//implicit setInterestRate(double interestRate)
//implicit boolean withdraw(double amount) 
//implicit boolean deposit(double amount)
//implicit double futureValue(int years) 

	
public String toString() {
		return "Checking Account Balance: $" + getBalance() +
				"\nChecking Account Interest Rate: " +INTEREST_RATE +
				"\nChecking Account Balance in 3 years: " +futureValue(3);

}
/* **End Methods definition ****/
}
	