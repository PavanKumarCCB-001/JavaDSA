package demo;
import java.util.Scanner;

public class Armstrong {
	
	boolean isarm(int n) {
		int l = (int)Math.ceil(Math.log10(n));
		int r = 0;
		for(int i=n; i > 0; i /= 10) {
			int ed = i % 10;
			r += Math.pow(ed,l);  }
		return r == n; 	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter a No. ");
		int n = ob.nextInt();
		
		Armstrong obj = new Armstrong();
		System.out.print(obj.isarm(n));
		
		ob.close();	} }