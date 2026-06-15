package demo;
import java.util.Scanner;

public class Palindrome_Number {
	
	boolean isP(int x) 	{
		
		int r = 0;
		for(int N = x; N > 0; N /= 10) {
			int ed = N % 10;
			r = (r * 10) + ed; }
		
		return r == x ; 	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int n = ob.nextInt();
		
		Palindrome_Number obj = new Palindrome_Number();
		System.out.println(obj.isP(n));
		
		ob.close(); } } 