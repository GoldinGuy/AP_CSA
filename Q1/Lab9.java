package Q1;

	import java.util.Scanner;


	public class Lab9 {

		public static Scanner s = new Scanner(System.in);
		
		public static void main(String[] args) {
			int list[] = {2, 15, 7, 30, 5, 55, 3, 19, 10, 13};
			int index = 0, changed = 0;
			System.out.println("The list contains the following elements: ");
			for (int i = 0; i<list.length; i++){
				System.out.println(list[i]);
			}
			while (true){
			System.out.println("\nPlease enter the value that you wish to search for: ");
			int searchTerm=s.nextInt();
			for (int i=0; i<list.length; i++){
				if (list[i]==searchTerm){
					index = i;
					changed += 1;
				} else if (changed < 1) {
					index = -1;
				}
			}
		changed = 0;
			if (index==-1){
				System.out.println("\n" + searchTerm + " is not found in the array");
			}
			else{
				System.out.println("\n" + searchTerm + " is located at index " + index);
			}
		}
		} // end loop
	
	}
	
	
	
//	With methods
//	
//	package Q1;
//
//	import java.util.Scanner;
//
//
//	public class Lab9 {
//
//		public static Scanner s = new Scanner(System.in);
//		
//		public static void main(String[] args) {
//			int list[] = {2, 15, 7, 30, 5, 55, 3, 19, 10, 13};
//			System.out.println("The list contains the following elements: ");
//			for (int i = 0; i<list.length; i++){
//				System.out.println(list[i]);
//			}
//			System.out.println("Please enter the value that you wish to search for: ");
//			int searchTerm=s.nextInt();
//			int index = linearSearch(list, searchTerm);
//			if (index==-1){
//				System.out.println(searchTerm + " is not found in the array");
//			}
//			else{
//				System.out.println(searchTerm + " is located at index " + index);
//			}
//		}
//		
//		
//		public static int linearSearch(int list[], int searchTerm) {
//			for (int i=0; i<list.length; i++){
//				if (list[i]==searchTerm){
//					return i;
//				}
//			}
//			return -1;
//		}
//
//	}

