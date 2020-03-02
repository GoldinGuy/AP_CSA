package Q2;

public class Lab2 {

	public static void main(String[] args) {

	 System.out.println("The absolute Value of -52 is " + Ab(-53));
	 System.out.println("The absolute Value of -12.5 is " + Ab(-12.5));
	 System.out.println("2.5 to the power of 3 is " + Pow(2.5, 3));
	 System.out.println("-3.0 to the power of 9.0 is " + Pow(-3.0, 9.0));
	 System.out.println("The square root of 125.0 is " + Sqrt(125.0));
	 System.out.println("The sqaure root of -125.0 is " + Sqrt(-125.0));
	 
	 for (int i=0; i<3; i++){
		 System.out.println("A random number between -25 and 25 is " + Rand(50, -25));
	 }
	 
	 System.out.println("A random number between 0 and 9 is " + Rand2(10, 0));
	 System.out.println("A random number between 1 and 10 inclusive is " + Rand2(10, 1));
	}
	
	static int Ab (int x){
		return Math.abs(x);
	}
	
	static double Ab (double x){
		return Math.abs(x);
	}
	
	static double Pow(double d, double y){
		return Math.pow(d, y);
	}
	
	static double Sqrt(double x){
		return Math.sqrt(x);
	}
	
	static int Rand (int x, int y){
		return ((int)(Math.random()*x))+y;
	}
	
	static int Rand2 (int x, int y){
		return ((int)(Math.random()*x))+y;
	}

}
