import java.io.*;
import java.util.*; //includes ArrayList
import java.text.*; //for NumberFormat

public class Tester {
	public static void main(String args[]) {
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		ArrayList aryList = new ArrayList();
		do {
			Scanner kbReader = new Scanner(System.in);
			System.out
					.print("Please enter the name to whom the account belongs.(Exit to abort)");
			name = kbReader.nextLine();
			if (!name.equalsIgnoreCase("EXIT")) {
				System.out.print("Please enter the amount of the deposit.");
				double amount = kbReader.nextDouble();
				System.out.println(""); // gives an eye-pleasing blank line
				BankAccount ba = new BankAccount(name, amount);
				aryList.add(ba);
			}
		} while (!name.equalsIgnoreCase("EXIT"));

		// Search aryList and print out the name and amount of the largest bank
		// account
		BankAccount ba = (BankAccount) aryList.get(0);
		double maxBalance = ba.balance;
		String maxName = ba.name;
		for (int j = 1; j < aryList.size(); j++) {
			if (((BankAccount) aryList.get(j)).balance > maxBalance) {
				maxBalance = ((BankAccount) aryList.get(j)).balance;
				maxName = ((BankAccount) aryList.get(j)).name;
			}
		}
		System.out
				.println("\nThe bank account with the largest balance belongs to "
						+ maxName + ". \nThe Amount is " + maxBalance);
	}
}