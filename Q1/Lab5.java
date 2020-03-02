package Q1;
import java.util.Scanner;

public class Lab5 {
	
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		double sum=0, avg=0, count=0;
		String letter = "Invalid Grade";
		System.out.println("\nEnter -1 to Quit");
		do {
			System.out.println("\nEnter Score: ");
			int grade=s.nextInt();
			
			if(grade==-1) {break;}
			
			if((grade>=90) && (grade<=100)){
				letter = "A";
			}
			else if((grade>=80) && (grade<90)){
				letter = "B";
			}
			else if((grade>=70) && (grade<80)){
				letter = "C";
			}
			else if((grade>=60) && (grade<70)){
				letter = "D";
			}
			else if((grade>=0) && (grade<60)){
				letter = "F";
			}
			else if((grade<0)){
				letter = "Invalid";
			}
				
			System.out.println("\nComputed Grade is " + letter);			
				
			sum += grade;
			avg += grade;
			count+=1;
		

		}  while (true);

		avg /= count;
//		System.out.println("Sum of all grades: " + sum);
//		System.out.println("Average of all grades: " + avg);
		
	}

}
