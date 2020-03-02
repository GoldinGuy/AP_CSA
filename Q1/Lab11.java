package Q1;

import java.util.Scanner;

public class Lab11 {

	static String name;
	static int x;
	static int y;
	static int z;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		System.out.println("\nEnter your name: ");
//		name = input.next();

		System.out.println("\nEnter a number: ");
		x = input.nextInt();

		System.out.println("Enter a number: ");
		y = input.nextInt();

//		System.out.println("Your name is " + name);
		

		input.close();

		System.out.println("The Sum Of The Two Numbers Is " + sum());
		System.out.println("The Difference Of The Two Numbers Is " + difference());
		System.out.println("The Quotient Of The Two Numbers Is " + quotient());
		System.out.println("The Average Of The Two Numbers Is " + average());
		System.out.println("The Product Of The Two Numbers Is " + product());
		System.out.println("The Modulus Of The Two Numbers Is " + modulus());

	} // ends main

	static int sum() {

		z = x + y + 3;
		
		return z;

	} // ends

	static int difference() {

		z = x - y;
		return z;

	} // ends

	static int product() {

		z = x * y;
		return z;
	
	} // ends

	static int quotient() {

		z = x / y;
		return z;

	} // ends

	static int average() {

		z = (x + y) / 2;
		return z;
		

	} // ends

	static int modulus() {
		z = x % y;

		return z;

	} // ends

} // ends class

