package Q3;
//import
import java.util.ArrayList;
import java.util.Scanner;

public class QProject3part2 {
//	initial variables
	double balance;
	int accountNum;
	Scanner s = new Scanner(System.in);
	public ArrayList<QProject3part2> BankAccount = new ArrayList<QProject3part2>();
	
//	default constructor
	QProject3part2(){
	}

//	constructor with parameters
	QProject3part2(int aNum, double bal){
		balance = bal;
		accountNum = aNum;
	}
	
//	runs menu - uses if/else in while loop to determine which method to run
	private void runMenu(){
		String selection;
		while (true){
			System.out.println("\nMake a Selection:\nPress A to add account\nPress D to make a deposit\nPress S to display all accounts\nPresss Q to quit");
			selection = s.next().toUpperCase();
			if (selection.equals("A")){
				addAccount();
			} else if (selection.equals("D")){
				makeDeposit();
			} else if (selection.equals("S")){
				displayAccounts();
			} else if (selection.equals("Q")){
				System.out.println("\nThank you for using the Bank Account Program. Goodbye!");
				break;
			} else {
				System.out.println("\nInvalid Input");
				runMenu();
			}
		}
	}
	
//	displays accounts with for loop
	private void displayAccounts() {
		System.out.println( "\nAccount Number" + "	|	Balance");
		for (int i=0;i<BankAccount.size();i++){
			System.out.println(i + " - " + BankAccount.get(i).accountNum + "	|	$" + BankAccount.get(i).balance);
		}
	}

	
//	makes deposit
	private void makeDeposit() {
		displayAccounts();
		System.out.println("\nEnter an account number: ");
		int acc = s.nextInt();
//			check if account exists
		for (int i=0;i<BankAccount.size();i++){
			if (BankAccount.get(i).accountNum == acc){
				System.out.println("\nEnter amount to deposit: $");
				int dep = s.nextInt();
				BankAccount.get(i).balance += dep;
				System.out.println("\nBalance is now: $" +  BankAccount.get(i).balance);
				break;
			}
			System.out.println("\nInvalid Input ");
		}
	}
	
//	withdraws
	private void withdraw() {
		displayAccounts();
		System.out.println("\nEnter an account number: ");
		int acc = s.nextInt();
//			check if account exists
		for (int i=0;i<BankAccount.size();i++){
			if (BankAccount.get(i).accountNum == acc){
				System.out.println("\nEnter amount to withdraw: ");
				int with = s.nextInt();
					if(BankAccount.get(i).balance >= with){
						BankAccount.get(i).balance += with;
						System.out.println("\nYou have withdrawn $" + with);
						System.out.println("\nBalance is now: $" +  BankAccount.get(i).balance);
					}
				
				break;
			}
			System.out.println("\nInvalid Input ");
		}
	}

//	adds account to arraylist
	private void addAccount(){
		int acc, val=0;
		double bal;
		System.out.println("\nEnter new account number: ");
		acc = s.nextInt();
//		check if account exists
		for (int i=0;i<BankAccount.size();i++){
			if (BankAccount.get(i).accountNum == acc){
				 val +=1;
			}
		}
		if (val == 0){
			System.out.println("\nEnter new account balance: ");
			bal = s.nextDouble();
			BankAccount.add(new QProject3part2(acc, bal));
		} else {
			System.out.println("\nAccount number already exists ");
		}
	
	}
	
//	main/test method
	public static void main(String args[]){
		System.out.println("*************** Welcome to the Bank Account Program*************");
		QProject3part2 object = new QProject3part2();
		object.runMenu();
	
	}
	
	
	
}
