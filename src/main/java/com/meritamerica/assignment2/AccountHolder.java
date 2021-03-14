package com.meritamerica.assignment2;
import java.util.*;

/**
 * This class represents an Account holder for MeritAmericaBank.
 * The account holder has instance variables (first, middle and last name,
 * and a Social Security Number). 
 * */
public class AccountHolder {	
	
/* *************** INSTANCE VARIABLES*******************/	
private String firstName, middleName, lastName, ssn;
static CheckingAccount checking;	//Each AccountHolder has a CheckingAccount instance 
static SavingsAccount savings;	//Each AccountHolder has a SavingsAccount instance 
static CDAccount cdAccount;	//Each AccountHolder has a CDAccount instance 


/* ******* STATIC VARIABLES *****/
static Scanner scan = new Scanner(System.in); // Used to get input
private static final double CHECKING_RATE = 0.0001;
private static final double SAVINGS_RATE = 0.01;
static CheckingAccount [] arrCheckingAccounts = new CheckingAccount[100]; // Array to store all the existing CheckingAccount
static int checkingCount = 0;
static SavingsAccount [] arrSavingsAccounts = new SavingsAccount[100]; // Array to store all the existing SavingsAccount
static int savingsCount = 0;
static CDAccount [] arrCDAccounts = new CDAccount[100]; // Array to store all the existing CDAccounts
static int CDCount = 0;


/* *********** CONSTRUCTOR **************/

public AccountHolder(String firstName, String middleName, String lastName, String ssn)
{
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.ssn = ssn;
}

/*---------------------- CLASS METHODS  ------------------------*/
/* ********* GETTERS and SETTERS ****************/

public String getFirstName(){ return firstName;}
private void setFirstName(String firstName){ this.firstName = firstName;}
public String getMiddleName(){ return middleName;}
private void setMiddleName(String middleName){ this.middleName = middleName;}
public String getLastName(){ return lastName;}
private void setLastName(String lastName){ this.lastName = lastName;}
public String getSSN(){ return ssn;}
private void setSSN(String ssn){ this.ssn = ssn;}
/* ****/
static CheckingAccount addCheckingAccount(double openingBalance) {
	/* Must return a new CheckingAccount with an accountNumber, balance and interestRate*/
	checking = new CheckingAccount(openingBalance);
	//checking.setBalance(openingBalance);
	checking.setInterestRate(CHECKING_RATE);
	arrCheckingAccounts[checkingCount] = checking;
	checkingCount++;
	return checking;
}
/* ****/
public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
	arrCheckingAccounts[checkingCount] = checkingAccount;
	checkingCount++;	
	return checkingAccount;
}
/* ****/
public CheckingAccount[] getCheckingAccounts() {
	/* Must return an Array of all existing CheckingAccounts */
	return arrCheckingAccounts;	
}
/* ****/
static int getNumberOfCheckingAccounts() { return checkingCount;}

/* ****/
public double getCheckingBalance() {
	double checkingBalance = checking.getBalance();
	return checkingBalance;
}
/* ****/
/* ****/
static SavingsAccount addSavingsAccount(double openingBalance) {
	/* Must return a new SavingsAccount with an accountNumber, balance and interestRate*/
	savings = new SavingsAccount(openingBalance);
	//savings.setBalance(openingBalance);
	savings.setInterestRate(SAVINGS_RATE);
	arrSavingsAccounts[savingsCount] = savings;
	savingsCount++;
	return savings;	
}
/* ****/
public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
	arrSavingsAccounts[savingsCount] = savingsAccount;
	savingsCount++;	
	return savingsAccount;
}
/* ****/
public SavingsAccount[] getSavingsAccounts() {
	/* Must return an Array of all existing CheckingAccounts */
	return arrSavingsAccounts;		
}
/* ***/
public int getNumberOfSavingsAccounts() { return savingsCount;}
/* ****/
double getSavingsBalance() {
	double savingsBalance = savings.getBalance();
	return savingsBalance;
}
/* ****/
/* ****/
public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
	/* ***** Must return a new CD Account object *****/
	String CDInfo = cdAccount.toString();
	System.out.println(CDInfo +"\n\nCD Term: ");
	int term = scan.nextInt();
	offering = new CDOffering(term, offering.getInterestRate());
	cdAccount = new CDAccount(offering, openingBalance);
	arrCDAccounts[CDCount] = cdAccount;
	CDCount++;
	return cdAccount;	
}
/* ****/
public CDAccount addCDAccount(CDAccount cdAccount) {
	arrCDAccounts[CDCount] = cdAccount;
	CDCount++;
	return cdAccount;
}
/* ****/
public CDAccount[] getCDAccounts() { return arrCDAccounts;}
public int getNumberOfCDAccounts() { return CDCount;}
/* ****/
public double getCDBalance() {
	double CDBalance = cdAccount.getBalance();
	return CDBalance;
}
/* ****/
public double getCombinedBalance() {
	return (getCheckingBalance() + getSavingsBalance() + cdAccount.getBalance());
}
/* AccountHolder representation */

/* ########################################################################################*/

}






