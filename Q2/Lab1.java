package Q2;

public class Lab1 {

	public static void main(String[] args) {

		int[] array = { 30, 15, 7, 2, 5, 55, 3, 19, 10, 13 };
		int i =0, n=array.length-1;

		System.out.println("The size of the array is " + (array.length));
		System.out.println("Here are the contents of the array: ");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		} // end loop
		
		System.out.println("The smallest value is " + findInedexOfSmallest(array, i, n));

	} // end main

	static int findInedexOfSmallest(int array[], int i, int n) {
		int smallestAt = array[0];
		for (int j = i; j < n; j++) {
			if (array[j] < smallestAt) {
				smallestAt = array[j];
			}
		} // end loop
		return smallestAt;
	}

} // end class

