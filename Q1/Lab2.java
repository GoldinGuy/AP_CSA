package Q1;
import java.util.Scanner;
	
public class Lab2 {

		static int x;
		static int y;
		static int z;
		
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			
//			System.out.println("\nEnter a number: ");
//			x=input.nextInt();
//			
//			System.out.println("Enter a number: ");
//			y=input.nextInt();
			
			x = 105;
			y = 5;
			
			
			sum();
			difference();
			quotient();
			average();
			product();
			modulus();

			input.close();
		} // ends main
		

		static void sum()
		{
			
			z = x + y;
			
			System.out.println("The Sum Of The Two Numbers Is " + z);
		
		} // ends 
		
		
		static void difference()
		{
			
			z = x - y;
			
			System.out.println("The Difference Of The Two Numbers Is " + z);
		
		} // ends 
		
		
		static void product()
		{
			
			z = x * y;
			
			
			System.out.println("The Product Of The Two Numbers Is " + z);
		
		} // ends 
		
		static void quotient()
		{
			
			z = x / y;
			
			System.out.println("The Quotient Of The Two Numbers Is " + z);
		
		} // ends 
		
		static void average()
		{
			
			z = (x + y) / 2;
			
			System.out.println("The Average Of The Two Numbers Is " + z);
		
		} // ends 
		
		
		static void modulus()
		{
			z = x % y;
			
			System.out.println("The Modulus Of The Two Numbers Is " + z);
		
		} // ends 
		


	} // ends class

