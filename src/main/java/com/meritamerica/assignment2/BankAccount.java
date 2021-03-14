package com.meritamerica.assignment2;

import java.util.*;

public class BankAccount 
{	
   /* **** INSTANCE VARIABLES AND CONSTANTS *****/
	
   /* Each Account has attributes \accountNumber\, \balance\, \InterestRate\ */
   long accountNumber;
   private double balance, interestRate;

   /* **********************************************/		
   Scanner sc = new Scanner(System.in);
		
   /* **** DEFINING OUR CONSTRUCTORS *****/
   //public BankAccount() {};
   public BankAccount(double balance, double interestRate) 
      {	
		this.accountNumber = 0;	
		this.balance = balance;
		this.interestRate = interestRate;	
      }
   
	/* Second Constructor, used when to initialize instance attributes */
   BankAccount(long accountNumber, double balance, double interestRate)
	 {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	/* *** METHODS DEFINITION ***/
	/* ** Getter and Setters */
   
   
    public long getAccountNumber() {return accountNumber;}
	public double getBalance() {return balance;}
	public void setBalance(double balance) { this.balance = balance;  }
	public double getInterestRate() { return interestRate;}
	public void setInterestRate(double interestRate) {this.interestRate = interestRate;}
	/* -----------------------------------------------------*/
	public boolean withdraw(double amount)  
	   { 
		if(amount <0.0) { System.out.println(" !!!!! Negative amount"); return false;}
		else if(amount>balance) { System.out.println(" Unsufficient funds"); return false;}
		else { balance -=amount; return true;}		
	   }
	/* -----------------------------------------------------*/
	public boolean deposit(double amount)
	   { 
		if(amount <0.0) { System.out.println(" !!!!! Negative amount"); return false;}
		else { balance +=amount; return true;}		
	   }
	/* -----------------------------------------------------*/
	public double futureValue(int years) 
	   {
		double FV = balance * Math.pow((1 + interestRate), years);
		return FV;
       } 
	/* -----------------------------------------------------*/
	
		
}
