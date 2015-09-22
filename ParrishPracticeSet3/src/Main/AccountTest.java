package Main;

import static org.junit.Assert.*;
//import appropriate junit libraries and methods
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import the classes we are going to test
import Main.Account;
import Main.InsufficientFundsException;

public class AccountTest {
	//create an account c to start with
	Account c;
	//set up the account before we run the test, but set it up only once
	@Before
	public void setUp() throws Exception {
		c = new Account(1122, 20000);
	}
	//make sure everything is torn down after the test so new account could be created
	@After
	public void tearDown() throws Exception {
		c = null;
	}
	
	//test the account method and make sure it can throw the InsufficientFundsException if applicable
	@Test
	public void testAccount() throws InsufficientFundsException {
		//assign the annual interest rate
		double annualInterestRate=0.045;
		//assign the monthly interest rate
		double rate = c.getMonthlyInterestRate(annualInterestRate);
		double amountw=2500;
		double amountd=3000;
		assertTrue("assertion didn't work",c.withdraw(amountw)==17500.0);
		assertTrue("assertion didn't work",c.deposit(amountd)==20500);
		System.out.printf("The monthly interest rate is $%.2f", rate);
		System.out.print("The date the account was created is " + c.getdateCreated());
		
	}

}

