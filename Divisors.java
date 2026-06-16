package demo;
import java.util.*;

public class Divisors {
	List<Integer> DIV(int n) {
		List<Integer> R = new ArrayList<Integer>();
		for(int i=1; i<= Math.sqrt(n); i++) {
			if(n % i == 0) {
				R.add(i);
				if((n / i ) != i) R.add(n/i); } }
		Collections.sort(R);
		return R; }

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter a No. ");
		int n = ob.nextInt();
		
		Divisors obj = new Divisors();
		for(int i : obj.DIV(n))
			System.out.print(i+" ");
		ob.close(); } }