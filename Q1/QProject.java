package Q1;

import java.util.Scanner;

public class QProject {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		calcTax();

	} // end of main

	public static void calcTax() {
		// declare variables
		String x, y;
		double gross = 0, tax = 0, taxIncome = 0, taxOwed = 0;
		int exempt = 0;
		boolean on = true, notValid = true;
		System.out.println("\nWelcome To The Riche Income Tax Program!");
		// begin loop
		do {
			do {
				System.out
						.println("\nAre You (S)ingle, (M)arried, Or (C)ohabiting? \nEnter S, M, or C: ");
				x = input.next();
				x = UpperCase(x);
				if (x.equals("C") || x.equals("M") || x.equals("S")) {
					notValid = false;
				} else {
					System.out.println("\nPlease enter a valid input");
				}
			} while (notValid == true);
			// determine value
			notValid = true;
			System.out.println("\nEnter Your Gross Income: ");
			gross = input.nextDouble();
			System.out.println("\nEnter Your Number Of Exemptions: ");
			exempt = input.nextInt();
			// compute exemptions
			if (exempt < 0) {
				exempt = 0;
			}
			// compute taxes
			taxIncome = gross - (1000 * exempt);

			if (x.equals("S")) {
				tax = 0.2;
			} else if (x.equals("M")) {
				tax = 0.25;
			} else if (x.equals("C")) {
				if (taxIncome < 20000) {
					tax = .10;
				} else if (taxIncome > 20000 & taxIncome <= 50000) {
					tax = .15;
				} else if (taxIncome > 50000) {
					tax = .30;
				}
			}

			taxOwed = taxIncome * tax;
			if (taxOwed < 0) {
				taxOwed = 0;
			}
			if (taxIncome < 0) {
				taxIncome = 0;
			}
			tax = tax * 100;
			// print values
			System.out.println("\nIncome Tax Summary: ");
			System.out.println("\nTax Rate:   " + tax + "%");
			System.out.println("\nTaxable Income:   $" + taxIncome);
			System.out.println("\nTaxes Owed:   $" + taxOwed);
			System.out.println("\nProccess Another Customer? (Y/N)");
			y = input.next();

			if (y.equals("N") | y.equals("n")) {
				on = false;
			}

		} while (on);
		System.out
				.println("\nThanks For Using The Income Tax Program. Good Bye!");
	}

	
	public static String UpperCase(String pname) {
		String whatever = ("");

		for (int i = 0; i < pname.length(); i++) {
			char c = Character.toUpperCase(pname.charAt(i));
			whatever += c;
		}
		return whatever;
	}

}