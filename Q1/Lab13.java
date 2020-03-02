package Q1;

import java.util.Scanner;

public class Lab13 {

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int list[] = { 2, 15, 7, 30, 5, 55, 3, 19, 10, 13 };
		System.out.println("The list contains the following elements: ");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

		while (true) {
			System.out
					.println("\nPlease enter the value that you wish to search for: ");
			int searchTerm = s.nextInt();
			int index = linearSearch(list, searchTerm);
			if (index == -1) {
				// System.out.println(searchTerm +
				// " is not found in the array");
				System.out.println("-1");
			} else {
				System.out
						.println(searchTerm + " is located at index " + index);
			}
		}
	}

	public static int linearSearch(int list[], int searchTerm) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == searchTerm) {
				return i;
			}
		}
		return -1;
	}

}
