package demo;
import java.util.Scanner;

public class Fibonacci_Number {

	int PN(int n) {
		
		if(n == 0 || n == 1) 
			return n;
		else 
			return PN(n-1) + PN(n-2); 	}
	
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter a No. ");
		int n = ob.nextInt();
		
		Fibonacci_Number obj = new Fibonacci_Number();
		System.out.println("\nFibonacci Number is: "+obj.PN(n)); 
		
	ob.close();} } 