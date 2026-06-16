package demo;
import java.util.Scanner;

public class Checkprime {
	
	boolean isprime(int n) {
		int c = 0;
		for(int i=1; i<=(int)Math.floor(Math.sqrt(n)); i++) {
			if (n % i == 0) {
				c++;
				if(n/i != i) 
					c++; } }
		return c == 2; }
	
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter a No. ");
		int n = ob.nextInt();
		
		Checkprime obj = new Checkprime();
		System.out.println(obj.isprime(n)); 
		ob.close();} }