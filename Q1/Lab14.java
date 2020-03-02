package Q1;

import java.util.Arrays;

public class Lab14 {
	public static int elements[] = { 100, 56, 44, 98, 7, 69 };

	public static void main(String[] args) {
		miniMain();
	}

	static void miniMain() {
		System.out
				.println("\nHere are the contents of the array before the swap:");
		display(elements);
		swapElements(elements);
		System.out
				.println("\nHere are the contents of the array after the swap:");
		display(elements);
	}

	static void swapElements(int elements[]) {
		int temp;
		temp = elements[0];
		elements[0] = elements[4];
		elements[4] = temp;
	}

	static void display(int elements[]) {
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}
}
