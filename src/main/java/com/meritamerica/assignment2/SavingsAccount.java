package com.meritamerica.assignment2;

/**
 * This Class represents a typical Savings Account for MeritAmeriaBank.
 * As any Bank Account, it inherits attribute \accountNumber\, \balance\, \interestRate\ from
 * its parent class. 
 */
public class SavingsAccount extends BankAccount{

/* ****** CONSTANTS and INSTANCE VARIABLES*******/
private static final double INTEREST_RATE = 0.01;
	
/* ****** CONSTRUCTOR **********/
public SavingsAccount(double balance) {
	super(balance, INTEREST_RATE);
	setBalance(balance);
	setInterestRate(INTEREST_RATE);
		  
	}
	
/* ******** METHODS **********/ 

	
public String toString() {
		return "Savings Account Balance: $" + getBalance() +
				"\nSavings Account Interest Rate: " +INTEREST_RATE +
				"\nSavings Account Balance in 3 years: " +futureValue(3);

}
/* **End Methods definition ****/
}
	