package Q3;
import java.io.*;
import java.util.*;

public class Lab5 {
	

		public static void main(String args[]){
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Generate which term number?");
			int k = kbReader.nextInt();
			System.out.println();
			System.out.println("Term #" + k + " is " + modFibonacci(k));
		}

		static int modFibonacci(int k){
			if(k==0){
				return 3;
			} else if(k==1){
				return 5;
			} else if(k==2){
				return 8;
			} else
				return modFibonacci(k - 1) + modFibonacci(k-2) + modFibonacci(k-3);
			}
			
		}

