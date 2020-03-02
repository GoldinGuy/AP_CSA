package Q1;

import java.util.Scanner;

public class Lab8 {
	
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the first string: ");
		String word1=s.next();
		
		System.out.println("Please enter the second string: ");
		String word2=s.next();

		System.out.println("The newly concatenated word is: " + (word1 + word2) );
		int len = word1.length();
		String half= word1.substring(0, len/2);
		System.out.println("The first half of the first word is: " + half);
		int len2 = word2.length();
		String half2= word2.substring(len2/2);
		System.out.println("The second half of the second word is: " + half2);
		String word3 = half + half2;
		System.out.println("The newly concatonated word is: " + (word3));
		System.out.println("The first character of the new string is: " + (word3.substring(0,1)));
		System.out.println("The last character of the new string is: " + word3.substring(word3.length()-1));
		System.out.println("The new string contains " + (word3.length()) + " characters");
		System.out.println("The last two characters of the new string is: " + word3.substring((word3.length()-2), (word3.length())));
//		System.out.println("The position of the last two characters is at index " + (word3.length()-2) + " and index "+ (word3.length()-1));
		System.out.println("The position of the last two characters is at index " + (word3.length()-2));
	}
}