package Q1;

import java.util.Scanner;

public class bankAccount {
	
	public static Scanner s = new Scanner(System.in);
	private static double currentBalance;
	private static String customerName;

	public bankAccount()
	{
	currentBalance = 1000;
	setCustomerName("Seth Goldin");
		
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Bank of Riche! ");
		bankAccount checkingAccount = new bankAccount();
		checkingAccount.displayBalance();
		System.out.println("\nHow much would you like to deposit? ");
		double x=s.nextDouble();
		checkingAccount.deposit(x);
		checkingAccount.displayBalance();
		System.out.println("\nHow much would you like to withdraw? ");
		double y=s.nextDouble();
		checkingAccount.withdraw(y);
		checkingAccount.displayBalance();

	}
	
	
	public void deposit(double deposit){
		currentBalance += deposit;
	
	} // ends 
	
	public void withdraw(double withdraw){
		currentBalance -= withdraw;

	} // ends 
	
	
	public void displayBalance(){
		System.out.println("\nThe account is listed under " + customerName);
		System.out.println("The current balance of the account is $" + currentBalance);
	
	} // ends 

	public static String getCustomerName() {
		return customerName;
	}

	public static void setCustomerName(String customerName) {
		bankAccount.customerName = customerName;
	}
	

}
