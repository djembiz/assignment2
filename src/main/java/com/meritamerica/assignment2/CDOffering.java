package com.meritamerica.assignment2;

public class CDOffering {
	/* ** A CD Offering has an interestRate based on the Term which is a duration */
	/* ** INSTANCE VARIABLES **/
	private int term;
	private double interestRate;
	
	public CDOffering(int term, double interestRate)
	{
	this.term = term;
	this.interestRate = getInterestRate();
	
	}
	
	/* *** Getters Setters ***/
	int getTerm() { return term;}
	/* ****/
	
	double getInterestRate() {
		switch(term) {
		case 1: interestRate = 0.018;
		case 2: interestRate = 0.019;
		case 3: interestRate = 0.02;
		case 5: interestRate = 0.025;
		case 10:interestRate = 0.22;
		default: { System.out.println("Default term is 1 year"); this.interestRate = 0.018;}
		
		return interestRate;
		}
	}
	
	/* ****/
	public String toString() {
		return "		Our Certificate or Deposit Offerings \n\n" +
			   "1.  1 year term at 1.8%" +
			   "2.  2 year term at 1.9%" +
			   "3.  3 year term at 2.0%" +
			   "4.  5 year term at 2.5%" +
			   "5.  10 year term at 2.2%" ;}

}