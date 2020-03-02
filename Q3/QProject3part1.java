package Q3;
import java.util.ArrayList;
//import java.util.stream.IntStream;
import java.util.Scanner;

public class QProject3part1 {
	
	static Scanner s = new Scanner(System.in);
	
	public static ArrayList<Integer> array = new ArrayList<Integer>();
	
	
	public static void addElement(int element){
		array.add(element);
		
	}
	
	public static String add1(){
		String temp = "";
//		convert to size
		for(int i=0; i<array.size();i++){
			temp += array.get(i);
		}
		System.out.println("\nThe value of the old array is: \n" + temp);
		int sum = Integer.parseInt(temp) + 1;  

		temp = String.valueOf(sum);
//		convert to char
		char[] digits = temp.toCharArray();
//set arraylist to char
		for(int i=0; i<digits.length;i++){
			if(i==array.size()){
				array.add(Character.getNumericValue(digits[i]));
			} else {
				array.set(i, Character.getNumericValue(digits[i]));
			}
			
		}
		
		
//		print array values
		System.out.println("\nThe new values of the array are: ");
		for(int i=0; i<array.size();i++){
			System.out.println("[ " + array.get(i) + " ]");
		}
		return temp;
	}
	
	public static void main(String args[]) {
		for (int i=0;i<3;i++){
			 System.out.println("\nEnter the values you would like in the array:");
			 addElement(s.nextInt()); 

		}
	
	 System.out.println("\nThe value of the new array is: \n" + add1());

	}

	
}
