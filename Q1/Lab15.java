package Q1;

import java.io.*;
import java.util.Scanner;

class Lab15 {
	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(
			System.in));
	public static int a, i, j;
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		System.out.println("\nPart 1\n");
		tri1();
		System.out.println("\nPart 2\n");
		tri2();
		System.out.println("\nPart 3\n");
		tri3();
		System.out.println("\nPart 4\n");
		
		System.out.println("\nEnter the height of the mountain: \n");
		a = input.nextInt();


		for (i = a - 1; i >= 1; i--) {

			for (j = i; j > 0; j--) {
				System.out.print(" ");
			}

			for (j = 0; j < 2 * (a - i) - 1; j++) {
				System.out.print("*");
			}

			for (j = i; j > 0; j--) {
				System.out.print(" ");
			}

			System.out.print("\n");

		} // bottom

	} // end of main
	
	static void tri1() {
		 a = 5;
		for (int i =1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
//			for (j = i; j > 0; j--) {
//				System.out.print(" ");
//			}

			System.out.print("\n");

		}
	}
	
	
	static void tri2() {
		 a = 5;
		for (int i =1; i <= 5; i++) {

			for (int l = 4; l >= i; l--) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
//			for (j = i; j > 0; j--) {
//				System.out.print(" ");
//			}

			System.out.print("\n");

		}
	}
	
	static void tri3() {
		 a = 5;
		for (int i =1; i <= 10; i+=2) {

			for (int l = 8; l >= i; l--) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
//			for (j = i; j > 0; j--) {
//				System.out.print(" ");
//			}

			System.out.print("\n");

		}
	}
	
} // end class

