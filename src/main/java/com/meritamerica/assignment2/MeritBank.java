package com.meritamerica.assignment2;

import java.util.*;


public class MeritBank {
	/* ************INSTANCE VARIABLES ******************/
	AccountHolder accountHolder;
	
	/* ************STATIC VARIABLES ******************/
	/* ** An ArrayList to contain Account Numbers ****/
	private static ArrayList<Long> bankAccoutNumbers = new ArrayList<Long>();
	private static Random rgen = new Random();
    private static long [] accountNumber = new long[100];
    private static int AcctCount = 0;
    
	/* *********/
	static Scanner scan = new Scanner(System.in); // Used to get input
	static AccountHolder [] arrAccountHolder = new AccountHolder[100];
	static int acctHolderCount = 0;
	static CDOffering [] arrCDOffering = new CDOffering[100];
	static int CDofferCount = 0;
	
	
/* ########################################################################*/
	
static void addAccountHolder(AccountHolder accountHolder) {
		String First, Middle, Last, SSN;
		System.out.println("CREATE A NEW ACCOUNT HOLDER \n");
		System.out.println("First Name:  ");
		First = scan.nextLine();
		System.out.println("Middle Name:  ");
		Middle = scan.nextLine();
		System.out.println("Last Name:  ");
		Last = scan.nextLine();
		System.out.println("Social Security Number: ");
		SSN = scan.nextLine();
		accountHolder = new AccountHolder(First, Middle, Last, SSN);
		arrAccountHolder[acctHolderCount] = accountHolder;
		acctHolderCount++;	
	}
/* ************************************************************************/
static AccountHolder[] getAccountHolders() { return arrAccountHolder;}
/* ****/
static CDOffering[] getCDOfferings() {
		//int term =1;
		//double defautRate = 0.018;
		//CDOffering offering = new CDOffering(term, defautRate);
		return arrCDOffering;	
	}
		
	//static CDOffering getBestCDOffering(double depositAmount) {}
    //static CDOffering getSecondBestCDOffering(double depositAmount) {}	
   // static void clearCDOfferings() {}
    //static void setCDOfferings(CDOffering[] offerings) {}
	/* ****/
	
	
static long getNextAccountNumber() {
/* Generate new Unique Account Numbers */
int randomNBR = generate();
for(int k=0; k< AcctCount;k++) {
	if(accountNumber[k] == randomNBR) //If the array already contains the number, generate a new number
		randomNBR = generate();
    }
accountNumber[AcctCount] = (long)randomNBR;
AcctCount++;
return (long)randomNBR; 
}
/* ****/
static int generate() { return rgen.nextInt(1000);}
/* ****/
	
//static double totalBalances() { return get}
//static double futureValue(double presentValue, double interestRate, int term) {}		       
			     
		       
		 
		 
		 
		
	
	 
}
			     
		 
	 
		  
     		
	
   
    
		

	
	
	
	
	


	


