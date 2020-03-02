package Q1;

import java.util.Scanner;

//lab 10
public class Ti83 {
	public static Scanner input = new Scanner(System.in);
	public int num1;
	public int num2;
	public int answer;

	public Ti83() {
		num1 = 105;
		num2 = 5;
		answer = 0;
	}

	public Ti83(int int1, int int2) {
		num1 = int1;
		num2 = int2;
		answer = 0;
	}

	public void ComputeSum() {
		answer = num1 + num2;
		System.out.println("The sum of the numbers is " + answer);
	}

	public void ComputeDifference() {
		answer = num1 - num2;
		System.out.println("The difference of the numbers is " + answer);
	}

	public void ComputeProduct() {
		answer = num1 * num2;
		System.out.println("The product of the numbers is " + answer);
	}

	public void ComputeQuotient() {
		answer = num1 / num2;
		System.out.println("The quotient of the numbers is " + answer);
	}

	public void ComputeAverage() {
		answer = (num1 + num2) / 2;
		System.out.println("The average of the numbers is " + answer);
	}

	public void ComputeModulus() {
		answer = num1 % num2;
		System.out.println("The modulus of the numbers is " + answer);
	}

	public static void main(String[] args) {
		Ti83 Ti83 = new Ti83();
		Ti83.ComputeSum();
		Ti83.ComputeDifference();
		Ti83.ComputeQuotient();
		Ti83.ComputeAverage();
		Ti83.ComputeProduct();
		Ti83.ComputeModulus();

		System.out.println("\nEnter the first number: ");
		int int1 = input.nextInt();
		System.out.println("\nEnter the second number: ");
		int int2 = input.nextInt();
		Ti83 Ti84 = new Ti83(int1, int2);
		Ti84.ComputeSum();
		Ti84.ComputeDifference();
		Ti84.ComputeQuotient();
		Ti84.ComputeAverage();
		Ti84.ComputeProduct();
		Ti84.ComputeModulus();

	}

}