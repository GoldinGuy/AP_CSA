package Q2;

public class GP2 {
	
	public static void insertionSort(int elements[], int n) 
    {   
        for (int i = 1; i < n; ++i) { 
            int temp = elements[i]; 
            int j = i - 1; 
            while (j >= 0 && elements[j] > temp) { 
            	elements[j + 1] = elements[j]; 
                j = j - 1; 
            } 
            elements[j + 1] = temp; 
        }
    } 

	public static void main(String[] args) {
		
		int[] elements = {100, 15, 7, 30, 5, 55, 3, 19, 10, 13};
		System.out.println("Here are the contents of the unsorted (original) array: ");
		printArray(elements);
		insertionSort(elements, elements.length);
		System.out.println("\nHere are the contents of the sorted (new) array after calling insertionSort from the main method: ");
		printArray(elements);
	}
	
	public static void printArray(int elements[] ) {
       for (int i=0; i<elements.length; ++i) 
           System.out.print(elements[i]+" "); 
       System.out.println(); 
	}
}
	 

