package Q2;

import java.util.Scanner;

public class Lab4 {
	public static Scanner s = new Scanner(System.in);
	public static int $ = 100;

	public static void main(String[] args) {
		do {
			System.out.println("\nYou have " + $
					+ " tokens. Spin the wheel? (Press Y or N)");
			String x = s.nextLine();
			if (x.equals("Y")) {
				spinDaWheel();
			} else if (x.equals("N")) {
				break;
			} else {
				System.out.println("Invalid input, please try again ;)");
			}

		} while ($ > 0);
		System.out.println("Thanks for Playing!");
	}

	public static void spinDaWheel() {
		int r1 = 0, r2 = 0, r3 = 0;
		$ -= 1;
		for (int i = 0; i < 8; i++) {
			r1 = (int) (Math.random() * 3) + 1;
			r2 = (int) (Math.random() * 3) + 1;
			r3 = (int) (Math.random() * 3) + 1;
			System.out.println("         [ " + r1 + " ] [ " + r2 + " ] [ " + r3
					+ " ]");
			if (i == 7) {
				System.out.println("\n\nYour Numbers are: [ " + r1 + " ] [ "
						+ r2 + " ] [ " + r3 + " ]");

				if ((r1 == 1) && (r2 == 1) && (r3 == 1)) {
					$ += 4;
					System.out.println("You Win 4 Tokens");
				} else if ((r1 == 2) && (r2 == 2) && (r3 == 2)) {
					$ += 8;
					System.out.println("You Win 8 Tokens");
				} else if ((r1 == 3) && (r2 == 3) && (r3 == 3)) {
					$ += 12;
					System.out.println("You Win 12 Tokens");
				} else {
					System.out.println("You Lose :(");
				}
			}
			try {
				Thread.sleep(700- (i*60));
			} catch (InterruptedException ie) {
			}
		}
	}

}
