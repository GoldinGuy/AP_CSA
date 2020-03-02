

public class Banking {

	public static void main(String[] args) {
		
		Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
		Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
		Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
		
		acct1.deposit(25.85);
		
		double gomezBalance = acct2.deposit(500.00);
		System.out.println("Gomez balance after deposit: " + gomezBalance);
		System.out.println("Gomez balance after withdrawal: " + acct2.withdraw(430.75, 1.50));
		
		acct3.withdraw(800.00, 0.0); // exceeds balance
		
		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();
		
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);
		
		acct1.transferFunds(100.00, acct1, acct2);
		
		System.out.println(acct1);
		System.out.println(acct2);
		
		Account acct4 = new Account ("Mr. Riche", 873634, 0.0);
	}

}
