package Q1;

import java.util.Arrays;
import java.util.Scanner;

public class GP4 {

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		int elements[] = { 2, 15, 7, 30, 5, 55, 3, 19, 10, 13 };
		
		System.out.println("The elements contains the following elements: ");
		Arrays.sort(elements);
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
		
		System.out
				.println("Please enter the value that you wish to search for: ");
		int target = s.nextInt();
		
		int index = binarySearch(elements, target);
		
		if (index == -1) {
			System.out.println(index);
		} else {
			System.out.println(target + " is located at index " + index);
		}
	}

	public static int binarySearch(int elements[], int target) {
		
		int indexValue = -1, lenOfArray = elements.length - 1;

		int left = 0, right = lenOfArray;

		int middle = lenOfArray / 2;
		
		for (int i = 0; i < 4; i++) {

			if (target == elements[middle]) {
				indexValue = middle;
			}
			if (target < elements[middle]) {
				right = middle - 1;
				middle = right / 2;
				//System.out.println(elements[right] + "," + elements[middle]);
			}
			if (target > elements[middle]) {
				left = middle + 1;
				middle = (right - left) / 2 + left;

				//System.out.println(elements[left] + "," + elements[middle]);
			}

		}
		
		if (indexValue == -1) {
			indexValue = -1;
		}
		return indexValue;

	}

}
