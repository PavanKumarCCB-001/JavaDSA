package demo;
import java.util.Scanner;

public class Reverse_Integer {

	int REV(int n)
	{
		int N,r=0;
		for(N = n; N != 0; N /= 10)
		{
			int e = N % 10;		// Extracting Digit
			if(r > (Integer.MAX_VALUE) / 10 || r < (Integer.MIN_VALUE) / 10 )
				return 0;
			r = (r * 10) + e;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter a No.");
		int n = ob.nextInt();
		
		Reverse_Integer obj = new Reverse_Integer();
		System.out.println("Reverse of a given No. is "+obj.REV(n));
		ob.close();} }
