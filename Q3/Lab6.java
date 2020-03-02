package Q3;

import java.util.Scanner;

public class Lab6 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string in the format WORD*WORD");
		String word1 = s.next();
		System.out.println("Enter the second string in the format WORD*WORD");
		String word2 = s.next();
		System.out.println(combineString(word1, word2));
		
	}
	static String combineString(String word1, String word2){
		String combined;
		int index1 = word1.indexOf('*') + 1;
		int index2 = word2.indexOf('*') + 1;

		if ( word2.indexOf('*') != -1 &&  word1.indexOf('*') != -1){
			combined = "The combined string is " +  word1.substring(index1) + word2.substring(index2);
			return combined;
		} else {
			combined = "Invalid input";
			return combined;	
		}
		
	}
	
}
