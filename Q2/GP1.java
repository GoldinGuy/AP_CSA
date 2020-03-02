package Q2;

public class GP1 {
	
	public static void selectionSort(int elements[]) 
    { 
  
        for (int i = 0; i < elements.length-1; i++) 
        { 
            int smallest = i; 
            for (int j = i+1; j < elements.length; j++) 
                if (elements[j] < elements[smallest]) 
                	smallest = j; 

            int temp = elements[smallest]; 
            elements[smallest] = elements[i]; 
            elements[i] = temp; 
        } 
    } 

	public static void main(String[] args) {
		
		int[] elements = {100, 15, 7, 30, 5, 55, 3, 19, 10, 13};
		System.out.println("Here are the contents of the unsorted (original) array: ");
		printArray(elements);
		selectionSort(elements);
		System.out.println("\nHere are the contents of the sorted (new) array after calling selectionSort from the main method: ");
		printArray(elements);
	}
	
	public static void printArray(int elements[] ) {
       for (int i=0; i<elements.length; ++i) 
           System.out.print(elements[i]+" "); 
       System.out.println(); 
	}
}
	 

