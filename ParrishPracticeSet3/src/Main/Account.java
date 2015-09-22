package Main;
//importing date and time to use the current date method
import java.time.LocalDateTime;
//must import custom exception
import Main.InsufficientFundsException;

public class Account {
	private int ID=0;
	private double balance=0;
	private double annualInterestRate=0;
	private LocalDateTime dateCreated=LocalDateTime.now();
	//no arg constructor for a default account
	public Account() {	
	}
	//constructor with ID and balance
	public Account(int ID, double balance){
		this.ID=ID;
		this.balance=balance;	
	}
	//getter for ID and balance and annualInterestRate
	public int getID(){
		return ID;
	}
	public double getbalance(){
		return balance;
	}
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	//setters for ID and balance and annualInterestRate
	public void setID(){
		this.ID=ID;	
	}
	public void setbalance(){
		this.balance=balance;	
	}
	public void setannualInterestRate(){
		this.annualInterestRate=annualInterestRate;
	}
	//getter for dateCreated
	public LocalDateTime getdateCreated(){
		return dateCreated;
	}
	//getter for monthly interest rate
	public double getMonthlyInterestRate(double annualInterestRate){
		double MonthlyInterestRate=annualInterestRate/12;
		return MonthlyInterestRate;	
	}
	//withdraw method that throws InsufficientFundsException if you are withdrawing more than you have
	public double withdraw(double amount) throws InsufficientFundsException{
		
		if(amount <= balance) {
	         balance -= amount;
	      }
		else {
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
		return balance;
	}
	//deposit methos that retotals the balance in the account
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}

}

