package com.meritamerica.assignment2;

/** The CDAccount extends BankAccount **/

public class CDAccount extends BankAccount{
/* The CDAcount is an instance of BankAccount. 
 * Each CDAcount inherits attributes \accountNumber\, \balance\, \interestRate\ 
 * from the parent class. In addition, Each CDAccount has a \Offering\ depending on
 * the term (Duration).
 **/
/* ** INSTANCE VARIABLES **/
	
private CDOffering offering ;

/* *** CONSTRUCTOR **/
	
public CDAccount(CDOffering offering, double balance) {	
	
	//The balance  and InterestRate are attributes inherited from the parent class
	//The InterestRate value results from the term offering
	
	super(balance, offering.getInterestRate());
	setBalance(balance);
	setInterestRate(offering.getInterestRate());
	 
	
}
			
		
public String toString() {
	return "Our Certificate_of_Deposit Offerings \n\n" +
		   "1.  1 year term at 1.8%" +
		   "2.  2 year term at 1.9%" +
		   "3.  3 year term at 2.0%" +
		   "4.  5 year term at 2.5%" +
		   "5.  10 year term at 2.2%" ;

}	
		
	}
	
	
