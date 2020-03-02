package Q1;

public class Lab12 {

	public static void main(String[] args) {
		int[] array = {10,5,3,25,35,9,7,13};
		double sum=0, sqrtsum = 0;
		
//		System.out.println("The size of the array is " + (array.length));
//		System.out.println("The last element in the array is " + (array[array.length-1]));
//		
		for(int i=0; i<array.length; i++){
			sum=sum+array[i];
			} // end loop	
		System.out.println("The contents of the array are ");
		for (int i =0; i < array.length; i++){
			System.out.print(array[i] + ", ");
		}
		
		for (int i =0; i < array.length; i++){
			sqrtsum += (Math.sqrt(array[i]));
		}
		
		System.out.println("\n\nThe sum of all the elements in the array is " + sum);
		System.out.println("The average of all the elements in the array is " + (sum/array.length));
		System.out.println("The sum of the square roots of each element in the array is " + sqrtsum);
		
	} // end main
} // end class