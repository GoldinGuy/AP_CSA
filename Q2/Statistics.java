package Q2;

import java.util.Scanner;

public class Statistics {

	// scanner and instance variables
	public static Scanner s = new Scanner(System.in);
	double data[];
	int numElements;

	// constructor
	public Statistics(int numElements) {
		data = new double[numElements];
		numElements = 0;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("\nHow large would you like the array to be?");
		int size = s.nextInt();
		Statistics stats = new Statistics(size);
		stats.runMenu();
	}

	// runs the menu selector
	public void runMenu() {
		do {
			// print menu
			System.out
					.println("\nMenu\n\n1. Add an element\n2. Average\n3. Highest\n4. Lowest\n5. Display contents of array\n6. Quit\n\nMake a selection: ");
			int selection = s.nextInt();
			// chooses option
			if (selection == 1) {
				if (data.length > numElements) {
					System.out
							.println("\nEnter the value you wish to add to the array");
					double num = s.nextDouble();
					addtoCollection(num);
				} else {
					System.out.println("\nThe array is full");
				}
			} else if (selection == 2) {
				getAvg();
			} else if (selection == 3) {
				getMax();
			} else if (selection == 4) {
				getMin();
			} else if (selection == 5) {
				System.out
				.println("\nSet the first boundary (int)");
				int bound1 = s.nextInt();
				System.out
				.println("\nSet the second boundary (int)");
				int bound2 = s.nextInt();
				if (bound1 < 0){
					bound1 = 0;
				}
				if (bound2 > data.length-1){
					bound2 = data.length-1;
				}
				display(bound1, bound2);
			} else if (selection == 6) {
				System.out
				.println("\nThank you for using this program! :)");
				break;
			} else {
				System.out.println("\nInvalid Input");
			}
		} while (true);
	} // ends

	public boolean addtoCollection(double value) {
		boolean check;
		if (data.length > numElements) {
			data[numElements] = value;
			numElements++;
			check = true;
		} else
			check = false;

		return check;
	}

	// prints avg of all the elements in the array
	public void getAvg() {
		double avg = 0;
		for (int i = 0; i < data.length; i++) {
			avg += data[i];
		}
		avg /= 2;
		System.out.println("\nThe average of all the elements in the array is "
				+ avg);
	}

	// prints lowest value of all the elements in the array
	public void getMin() {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		System.out
				.println("\nThe lowest value of all the elements in the array is "
						+ min);
	}

	// prints highest value of all the elements in the array
	public void getMax() {
		double max = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}

		}
		System.out
				.println("\nThe highest value of all the elements in the array is "
						+ max);
	}

	// sets numElements to the length of the array
	public void getNumElements() {
		numElements = data.length;
	}

	// prints all the elements in the array
	public void display(int bound1,int bound2) {
		System.out.println("\nThe array contains the following elements");
		for (int i = bound1; i <= bound2; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println("");
	}

} // ends

