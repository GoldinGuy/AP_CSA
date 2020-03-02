package Q1;
//lab 9
public class Calculator {

	
public int num1;
public int num2;
public int answer;
	

	public Calculator(){
		num1= 105;
		num2 = 5;
		answer = 0;
	}
	
	public void ComputeSum() {
		answer = num1 + num2;
		System.out.println("The sum of the numbers is " + answer);
	}
	
	public void ComputeDifference() {
		answer = num1 - num2;
		System.out.println("The difference of the numbers is " + answer);
	}
	
	
	public void ComputeProduct() {
		answer = num1 * num2;
		System.out.println("The product of the numbers is " + answer);
	}
	
	
	public void ComputeQuotient() {
		answer = num1 / num2;
		System.out.println("The quotient of the numbers is " + answer);
	}
	
	public void ComputeAverage() {
		answer = (num1 + num2)/2;
		System.out.println("The average of the numbers is " + answer);
	}
	
	
	
	public void ComputeModulus() {
		answer = num1 % num2;
		System.out.println("The modulus of the numbers is " + answer);
	}
	
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.ComputeSum();
		cal.ComputeDifference();
		cal.ComputeProduct();
		cal.ComputeQuotient();
		cal.ComputeAverage();
		cal.ComputeModulus();
		
		
	}
	
}