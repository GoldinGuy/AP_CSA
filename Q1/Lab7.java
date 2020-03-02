package Q1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab7 {
	
	public static Scanner s = new Scanner(System.in);
	public static int count=0, sum=0;
	public static double avg=0;

	public static void main(String[] args) {
		
		System.out.println("\nWelcome to the Riche Test Grader! ");
		System.out.println("\nHow many grades do you wish to enter? ");
		count=s.nextInt();
		enterGrade();
		System.out.println("The total is: " + sum + " out of " + (count*100) + " possible points");
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Average of all grades: " + (df.format(avg)));
		
	}


	public static void enterGrade(){
		int x = 0;
		do {
			System.out.println("\nEnter Score: ");
			int grade=s.nextInt();
			
			if((grade <= 100) && (grade >= 0)){
				x+=1;
				sum += grade;
				avg += grade;
			}
			else {
				System.out.println(grade + " is not an acceptable grade");
			}

		}  while (x < count);
		avg /= count;
	} // ends 
	
	
}
